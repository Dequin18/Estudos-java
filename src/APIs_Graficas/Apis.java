package APIs_Graficas;

import java.awt.Button; 
import java.awt.FlowLayout; 
import java.awt.Frame; 
import java.awt.Label; 
import java.awt.Panel; 
import java.awt.TextField;
import java.awt.Window;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


public class Apis {
	private JFrame janela;
	private JLabel lblNome, lblEmail; 
	private JTextField txtNome, txtEmail; 
	private JButton btnSalvar, btnExibir; 
	private JPanel painel; 
	
	
	
	public Apis(String titulo) { 
		
		janela = new JFrame(titulo);
		JButton BotaoSAir = new JButton("Sair");
		
		BotaoSAir.addActionListener(e -> {
			System.exit(0);
			  
	         
	            
		});
		
		lblNome = new JLabel("Nome: "); 
		
		lblEmail = new JLabel("Email: "); 
		txtNome = new JTextField(20); 
		txtEmail = new JTextField(20); 
		btnSalvar = new JButton("Salvar");
	
		btnExibir = new JButton("Exibir"); 
		painel = new JPanel();
		painel.setLayout(new FlowLayout()); 
		painel.add(lblNome); 
		painel.add(txtNome); 
		painel.add(lblEmail); 
		painel.add(txtEmail); 
		painel.add(btnSalvar);
		painel.add(btnExibir); 
		painel.add(BotaoSAir);
	
		janela.add(painel); 
		janela.pack();
		janela.setVisible(true);
	}
	public static void main(String[] args) {
		Apis tela = new Apis("teste");
		

	}

}
