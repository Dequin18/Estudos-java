package APIs_Graficas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class Apis2 {
	
	
	public static void main(String[] args) {
		FormularioN form = new FormularioN();
		FormularioE form2 = new FormularioE();
		JFrame janela = new JFrame("Cadastro");
		janela.pack();
	
		janela.setLayout(new BorderLayout());
		
		JTabbedPane abas = new JTabbedPane();
		abas.addTab("Clientes", new FormularioN());
		abas.addTab("Clientes2",new FormularioE());

		

		
		janela.add(form, BorderLayout.NORTH);
		janela.add(form2,BorderLayout.SOUTH);
		
		janela.setVisible(true);
	}

}

class FormularioN extends JPanel{
	private JButton teste;
	private JComboBox caixa;
	
	 public FormularioN() {
		 String[] items = {"Opção 01","Opção 02", "Opção 03"};
		 caixa = new JComboBox(items);
		 teste = new JButton("Sair");
		add(new JTextField("Nome"));
		add(teste);
		add(caixa);
		
	}	 
}


class FormularioE extends JPanel{
	
	
	
	public FormularioE() {
		add(new JTextField("Email"));
		add(new Label());
		
		
	}	
}