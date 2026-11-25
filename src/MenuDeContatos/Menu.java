package MenuDeContatos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;



public class Menu extends JFrame implements MenuListener, ActionListener {
	private JFrame cadastrotela;
private JMenuBar barramenu;
private JMenu Cadastro, sobre, opcoes;
private  JMenuItem menucontatos, menusair, menuOpc;
private JLabel sobre1;
private JTextField txtNome, txtEmail;
private JButton btnCadastrar, btnExibir;
private List<contatos> meucont = new ArrayList<contatos>();

public Menu(String titulo) {
	this.setBounds(100, 100, 456, 112);
	iniciar();
	
}

	public void iniciar() {
		barramenu = new JMenuBar();
		Cadastro = new JMenu("Cadastro");
		sobre = new JMenu("Sobre");
		menucontatos = new JMenuItem("MenuContatos");
		menusair = new JMenuItem("Sair");
		sobre1 = new JLabel("Ola aqui é o sbre");
		opcoes = new JMenu("Opcoes");
		menuOpc = new JMenuItem("Configuracoes");
		
		opcoes.addMenuListener(this);
		menusair.addActionListener(this);
		menucontatos.addActionListener(this);
		Cadastro.addMenuListener(this);
		sobre.addMenuListener(this);
		sobre.add(sobre1);
		opcoes.add(menuOpc);
		Cadastro.add(menucontatos);
		Cadastro.add(menusair);
		barramenu.add(Cadastro);
		barramenu.add(sobre);
		barramenu.add(opcoes);
		
		this.setJMenuBar(barramenu); 
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void	abrirTelaCadastro() {
		cadastrotela = new JFrame();
		cadastrotela.setVisible(true);
		 JPanel painel = new JPanel();
         txtNome = new JTextField(15);
         txtEmail = new JTextField(15);
         btnCadastrar = new JButton("Cadastrar");
         btnExibir = new JButton("Exibir");
      
         btnExibir.addActionListener(this);
         btnCadastrar.addActionListener(this);
         painel.add(new JLabel("Nome:"));
         painel.add(txtNome);

         painel.add(new JLabel("E-mail:"));
         painel.add(txtEmail);

         painel.add(btnCadastrar);
         painel.add(btnExibir);
         
         cadastrotela.add(painel);
         cadastrotela.pack();
		
		
	}
	
	public static void main(String[] args) {
		new Menu("teste").setVisible(true);
	}

	@Override
	public void menuSelected(MenuEvent e) {
	
		
	}

	@Override
	public void menuDeselected(MenuEvent e) {
		
		
	}

	@Override
	public void menuCanceled(MenuEvent e) {
	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		if (e.getSource() == menucontatos) {
			abrirTelaCadastro();
		};
		if(e.getSource() == btnCadastrar) {
			contatos C1 = new contatos(txtNome.getText(), txtEmail.getText());
			meucont.add(C1);
			JOptionPane.showMessageDialog(Cadastro, "Salvo com sucesso!");
		}else if (e.getSource() == btnExibir) {
			JOptionPane.showMessageDialog(this, meucont);
		}
	}

}

class contatos{
	private String Nome;
	private String Email;
	public contatos (String Nome, String Email) {
this.Nome = Nome;
this.Email = Email;
	}
	public String getNome() {
		return this.Nome;
	}
	public String getEmail() {
		return this.Email;
	}
	public String toString() {
		return "Nome: " + this.Nome + " Email:" + this.Email;
	};
	
}
