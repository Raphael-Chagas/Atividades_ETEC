// Importa a biblioteca Swing, para elementos gráficos
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;


public class TelaCadastro extends JFrame {
	// Jframe = Janela gráfica 
	

	private static final long serialVersionUID = 1524572852857285728L;
	JLabel jlbNome, jlbEmail, jlbTelefone, jlbDados, jlbTitulo;
	// Exibe textos na janela gráfifca
	JTextField txtNome, txtEmail, txtTelefone;
	JTextArea txtMostrar;
	//Cria campos de texto na janela gráfica
	JToggleButton mostrar,limpar, sair;
	//Cria os botões na janela gráfica
	
	public TelaCadastro() {
	     // Define o título da janela
	     setTitle("Tela de cadastro simples");

	     // Define o tamanho da janela (largura, altura)
	     setSize(500, 500);

	     // Centraliza a janela no meio da tela
	     setLocationRelativeTo(null);

	     // Define que o programa encerra ao fechar a janela
	     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	     // Define layout nulo (permite posicionar componentes manualmente)
	     setLayout(null);

	     jlbTitulo = new JLabel("Cadastro de Aluno");
	     jlbTitulo.setBounds(200, 10, 200, 30);
	     add(jlbTitulo);
	     
	     jlbNome = new JLabel("Nome: ");
	     jlbNome.setBounds(60, 50, 200, 30);
	     add(jlbNome);
	     
	     txtNome = new JTextField();
	     txtNome.setBounds(130, 50, 300, 30);
	     add(txtNome);
	     
	     jlbEmail = new JLabel("Email: ");
	     jlbEmail.setBounds(60, 100, 200, 30);
	     add(jlbEmail);
	     
	     txtEmail = new JTextField();
	     txtEmail.setBounds(130, 100, 300, 30);
	     add(txtEmail);
	     
	     jlbTelefone = new JLabel("Telefone: ");
	     jlbTelefone.setBounds(60, 150, 200, 30);
	     add(jlbTelefone);
	     
	     txtTelefone = new JTextField();
	     txtTelefone.setBounds(130, 150, 300, 30);
	     add(txtTelefone);
	     
	     jlbDados = new JLabel("Dados: ");
	     jlbDados.setBounds(60, 200, 200, 30);
	     add(jlbDados);
	     
	     txtMostrar = new JTextArea();
	     txtMostrar.setBounds(130, 200, 300, 100);
	     add(txtMostrar); 
	     txtMostrar.setEditable(false);
	     
	     mostrar = new JToggleButton("Adicionar");
	     mostrar.setBounds(50, 350, 100, 30);
	     add(mostrar);
	     
	     limpar = new JToggleButton("Limpar");
	     limpar.setBounds(200, 350, 100, 30);
	     add(limpar);
	     
	     sair = new JToggleButton("Sair");
	     sair.setBounds(350, 350, 100, 30);
	     add(sair);
	     
	     
	     Controller controller = new Controller(
	     txtNome, txtEmail, txtTelefone, txtMostrar);
	             
	     // Associando os eventos aos botões 
	     mostrar.addActionListener(controller.acaoMostrar());
	     limpar.addActionListener(controller.acaoLimpar());
	     sair.addActionListener(controller.acaoSair());
	
	}
	 public static void main(String[] args) {

	     // Cria um objeto da tela
	    TelaCadastro tela = new TelaCadastro();

	     // Torna a janela visível
	     tela.setVisible(true);
	 }
}
