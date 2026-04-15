import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

    private JTextField txtNome;
    private JTextField txtEmail;
    private JTextField txtTelefone;
    private JTextArea txtMostrar;
    
    public Controller(
            JTextField txtNome,
            JTextField txtEmail,
            JTextField txtTelefone, 
    		JTextArea txtMostrar){

        this.txtNome = txtNome;
        this.txtEmail = txtEmail;
        this.txtTelefone = txtTelefone;
        this.txtMostrar = txtMostrar;
    }

	public JTextField getTxtNome() {
		return txtNome;
	}



	public void setTxtNome(JTextField txtNome) {
		this.txtNome = txtNome;
	}



	public JTextField getTxtEmail() {
		return txtEmail;
	}



	public void setTxtEmail(JTextField txtEmail) {
		this.txtEmail = txtEmail;
	}



	public JTextField getTxtTelefone() {
		return txtTelefone;
	}



	public void setTxtTelefone(JTextField txtTelefone) {
		this.txtTelefone = txtTelefone;
	}



	public JTextArea getTxtMostrar() {
		return txtMostrar;
	}


	public void setTxtMostrar(JTextArea txtMostrar) {
		this.txtMostrar = txtMostrar;
	}



	public ActionListener acaoMostrar() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = (txtNome.getText());
                String email = (txtEmail.getText());
                String telefone = (txtTelefone.getText());
                
                txtMostrar.setText("Nome: " + nome + "\n" + "Email: " + email + "\n" + "Telefone: " + telefone);
            }
        };
    }

	

    public ActionListener acaoLimpar() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNome.setText("");
                txtEmail.setText("");
                txtTelefone.setText("");
                txtMostrar.setText("");
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


