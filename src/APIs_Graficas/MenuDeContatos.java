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
private JButton btnSalvar, btnExibir;
private JPanel painel;


public MenuDeContatos() {
	lblNome = new JLabel("Nome ");
	lblEmail = new JLabel("Email ");
	txtNome = new JTextField(15);
	txtEmail = new JTextField(20);
	btnExibir = new JButton("Exibir");
	btnSalvar = new JButton("Salvar");
	painel = new JPanel();
	
	btnSalvar.addActionListener(this);
	btnExibir.addActionListener(this);
	
	
	painel.setLayout(new GridLayout(3,2));
	painel.add(lblNome);
	painel.add(txtNome);
	painel.add(lblEmail);
	painel.add(txtEmail);
	painel.add(btnExibir);
	painel.add(btnSalvar);
	
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
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == btnExibir){ 
			JOptionPane.showMessageDialog(this, minhalista);
		} else if (e.getSource() == btnSalvar) {
			contato meucontato = new contato();
			if(verificarEmail() == true) {
			meucontato.setNome(txtNome.getText());
			meucontato.setEmail(txtEmail.getText());
			if (!txtNome.getText().isEmpty()) { 
				minhalista.add(meucontato); 
				JOptionPane.showMessageDialog(this, "Contato: " +txtNome.getText()+ " adicionado com sucesso!"); 
			}
			} else {
				JOptionPane.showMessageDialog(this, "Digite um email valido!");
			}
			txtNome.setText("");
			txtEmail.setText("");
		}
		
	}

}

class contato {
private String email;
private String Nome;


public void setEmail(String email) {

	this.email = email;
}
public void setNome(String Nome) {

	this.Nome = Nome;
}

public String getEmail() {
	return this.email;
}

public String getNome() {
	return this.Nome ;
}

public String toString() {
	return "\n Nome: " + this.Nome + "\n e Email: " + this.email;
}

}