package br.com.controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraController {

    private JTextField txtNum1;
    private JTextField txtNum2;
    private JTextField txtResultado;
    
    public CalculadoraController(
            JTextField txtNum1,
            JTextField txtNum2,
            JTextField txtResultado) {

        this.txtNum1 = txtNum1;
        this.txtNum2 = txtNum2;
        this.txtResultado = txtResultado;
    }

    public JTextField getTxtNum1() {
		return txtNum1;
	}

	public void setTxtNum1(JTextField txtNum1) {
		this.txtNum1 = txtNum1;
	}

	public JTextField getTxtNum2() {
		return txtNum2;
	}

	public void setTxtNum2(JTextField txtNum2) {
		this.txtNum2 = txtNum2;
	}

	public ActionListener acaoSomar() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(txtNum1.getText());
                int num2 = Integer.parseInt(txtNum2.getText());
                int soma = num1 + num2;
                txtResultado.setText(String.valueOf(soma));
            }
        };
    }
	
	public ActionListener acaoSub() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(txtNum1.getText());
                int num2 = Integer.parseInt(txtNum2.getText());
                int soma = num1 - num2;
                txtResultado.setText(String.valueOf(soma));                
            }
        };
    }
	
	public ActionListener acaoDiv() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Float num1 = Float.parseFloat(txtNum1.getText());
                Float num2 = Float.parseFloat(txtNum2.getText());
                Float soma = num1 / num2;                
                txtResultado.setText(String.valueOf(soma));
            }
        };
    }
	
	public ActionListener acaoMulti() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(txtNum1.getText());
                int num2 = Integer.parseInt(txtNum2.getText());
                int soma = num1 * num2;
                txtResultado.setText(String.valueOf(soma));
            }
        };
    }

    public ActionListener acaoLimpar() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNum1.setText("");
                txtNum2.setText("");
                txtResultado.setText("");
                JOptionPane.showMessageDialog(null, "Campos limpos com sucesso!");
            }
        };
    }

    public ActionListener acaoSair() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };
    }
}