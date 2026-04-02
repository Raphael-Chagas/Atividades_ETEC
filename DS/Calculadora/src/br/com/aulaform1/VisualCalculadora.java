package br.com.aulaform1;

import javax.swing.*;
// Importa a biblioteca Swing, para elementos gráficos

import br.com.controller.*;
//Puxa outra parte do trabalho para cá. Tipo o link para puxar o JS no html quando tão separado

@SuppressWarnings("unused")
public class VisualCalculadora extends JFrame {
	// Jframe = Janela gráfica 
	

	private static final long serialVersionUID = 1524572852857285728L;
	JLabel jlbnum1, jlbnum2, jlbresultado, jlbtitulo;
	// Exibe textos na janela gráfifca
	JTextField txtNum1, txtNum2, txtResultado;
	//Cria campos de texto na janela gráfica
	JToggleButton somar, subtrair, multiplicar, dividir, limpar, sair;
	//Cria os botões na janela gráfica
	
	public VisualCalculadora () {
	     // Define o título da janela
	     setTitle("Calculadora no Java");

	     // Define o tamanho da janela (largura, altura)
	     setSize(500, 400);

	     // Centraliza a janela no meio da tela
	     setLocationRelativeTo(null);

	     // Define que o programa encerra ao fechar a janela
	     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	     // Define layout nulo (permite posicionar componentes manualmente)
	     setLayout(null);

	     jlbtitulo = new JLabel("Calculadora");
	     jlbtitulo.setBounds(217, 10, 200, 30);
	     add(jlbtitulo);
	     
	     jlbnum1 = new JLabel("1º Número: ");
	     jlbnum1.setBounds(60, 50, 200, 30);
	     add(jlbnum1);
	     
	     txtNum1 = new JTextField();
	     txtNum1.setBounds(130, 50, 300, 30);
	     add(txtNum1);
	     
	     jlbnum2 = new JLabel("2º Número: ");
	     jlbnum2.setBounds(60, 100, 200, 30);
	     add(jlbnum2);
	     
	     txtNum2 = new JTextField();
	     txtNum2.setBounds(130, 100, 300, 30);
	     add(txtNum2);
	     
	     jlbresultado = new JLabel("Resultado: ");
	     jlbresultado.setBounds(60, 150, 200, 30);
	     add(jlbresultado);
	     
	     txtResultado = new JTextField();
	     txtResultado.setBounds(130, 150, 300, 30);
	     add(txtResultado);
	     txtResultado.setEditable(false);
	     
	     somar = new JToggleButton("+");
	     somar.setBounds(75, 250, 50, 30);
	     add(somar);
	     
	     subtrair = new JToggleButton("-");
	     subtrair.setBounds(175, 250, 50, 30);
	     add(subtrair);
	     
	     multiplicar = new JToggleButton("x");
	     multiplicar.setBounds(275, 250, 50, 30);
	     add(multiplicar);
	     
	     dividir = new JToggleButton("÷");
	     dividir.setBounds(375, 250, 50, 30);
	     add(dividir);
	     
	     limpar = new JToggleButton("Limpar");
	     limpar.setBounds(100, 300, 100, 30);
	     add(limpar);
	     
	     sair = new JToggleButton("Sair");
	     sair.setBounds(300, 300, 100, 30);
	     add(sair);
	     
	     
	     CalculadoraController controller = new CalculadoraController(
	             txtNum1,
	             txtNum2,
	             txtResultado);
	     // Associando os eventos aos botões
	     somar.addActionListener(controller.acaoSomar());
	     subtrair.addActionListener(controller.acaoSub());
	     multiplicar.addActionListener(controller.acaoMulti());
	     dividir.addActionListener(controller.acaoDiv());
	     limpar.addActionListener(controller.acaoLimpar());
	     sair.addActionListener(controller.acaoSair());
	
	}
	 public static void main(String[] args) {

	     // Cria um objeto da tela
	     VisualCalculadora tela = new VisualCalculadora();

	     // Torna a janela visível
	     tela.setVisible(true);
	 }
}
