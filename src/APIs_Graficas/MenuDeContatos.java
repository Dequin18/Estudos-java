package APIs_Graficas;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes.Name;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MenuDeContatos extends JFrame implements ActionListener {
private List<contato> minhalista = new ArrayList<contato>();
private JLabel lblNome, lblEmail;
private JTextField txtNome, txtEmail;
private JButton btnSalvar, btnExibir, btnSair;
private JPanel painel;


public MenuDeContatos() {
	lblNome = new JLabel("Nome ");
	lblEmail = new JLabel("Email ");
	txtNome = new JTextField(15);
	txtEmail = new JTextField(20);
	btnExibir = new JButton("Exibir");
	btnSalvar = new JButton("Salvar");
	btnSair = new JButton("Sair");
	painel = new JPanel();
	
	btnSair.addActionListener(this);
	btnSalvar.addActionListener(this);
	btnExibir.addActionListener(this);
	
	
	painel.setLayout(new GridLayout(4,2));
	painel.add(lblNome);
	painel.add(txtNome);
	painel.add(lblEmail);
	painel.add(txtEmail);
	painel.add(btnExibir);
	painel.add(btnSalvar);
	painel.add(btnSair);
	
	this.getContentPane().add(painel);
	this.pack();
	this.setVisible(true);
	
	
}
	


	public static void main(String[] args) {
		MenuDeContatos cont = new MenuDeContatos();
	}

	private boolean verificarEmail() {
		boolean resp = false;
		if (txtEmail.getText().contains("@")) {
			resp = true;
		} else {
			resp = false;
		}
		
		return resp;
	}
	private boolean verificarNome() {
		boolean resp = false;
		if (txtEmail.getText().contains("")) {
			resp = true;
		} else {
			resp = false;
		}
		
		return resp;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == btnSair) {
		   System.exit(0);	
		}
		if (e.getSource() == btnExibir){ 
			JOptionPane.showMessageDialog(this, minhalista);
		} if (e.getSource() == btnSalvar) {
			contato meucontato = new contato(txtEmail.getText(), txtNome.getText());
			if(verificarEmail() == true && verificarNome() == false) {
				
			if (!txtNome.getText().isEmpty()) { 
				minhalista.add(meucontato); 
				JOptionPane.showMessageDialog(this, "Contato: " +txtNome.getText()+ " adicionado com sucesso!");
				}
			} else {
				JOptionPane.showMessageDialog(this, "Digite um email valido ou nome valido!");
			}
			txtNome.setText("");
			txtEmail.setText("");
		}
		
	}



class contato {
private String email;
private String Nome;

public contato(String email, String nome) {
	this.email = email;
	this.Nome = nome;
}

public String getEmail() {
	return this.email;
}

public String getNome() {
	return this.Nome ;
}

public String toString() {
	return "\n Nome: " + this.Nome + "\n Email: " + this.email;
}

}
}