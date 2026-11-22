package APIs_Graficas;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestandoComboBOx {
	private JLabel Nome, Email;
	private JTextField Name, Emai;
	private JButton Exibir, Salvar;
	private JComboBox Options;
	private JFrame janela;
	private JPanel subPanelN, subPanelE, subPanelB, Painel;
	
	
	public TestandoComboBOx(String titulo){
		subPanelB = new JPanel();
		subPanelN = new JPanel();
		subPanelE= new JPanel();
		Painel = new JPanel();
	janela = new JFrame();
	Nome = new JLabel("Nome:");
    Name = new JTextField(15);
    
    Email = new JLabel("E-mail:");
    Emai = new JTextField(15);
    
    String[] opcoes = {"Cliente", "Fornecedor", "Funcionário"};
    Options = new JComboBox<>(opcoes);

    Exibir = new JButton("Exibir");
    Salvar = new JButton("Salvar");

	
	Painel.setLayout(new BorderLayout());
	Painel.add(subPanelB, BorderLayout.CENTER);
	Painel.add(subPanelN, BorderLayout.NORTH);
	Painel.add(subPanelE, BorderLayout.SOUTH);

	subPanelE.add(Email);
	subPanelE.add(Emai);
	subPanelN.add(Nome);
	subPanelN.add(Name);
	subPanelB.add(Exibir);
	subPanelB.add(Options);
	subPanelB.add(Salvar);
		
	
	
	janela.getContentPane().add(Painel);
	janela.pack();
	janela.setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		TestandoComboBOx tela = new TestandoComboBOx("Teste");
		
		
		

	}

}
