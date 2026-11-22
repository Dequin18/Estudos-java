package APIs_Graficas;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class Apis2 extends JPanel {
	
	
	public static void main(String[] args) {
		Formulario form = new Formulario();
		JFrame janela = new JFrame("Cadastro");
		janela.setSize(500, 400);
		janela.add(form);
		
		
		JTabbedPane abas = new JTabbedPane();
		abas.addTab("Clientes", new Formulario());
		abas.addTab("Clientes2",new Formulario());


		
		janela.add(abas);
		janela.setVisible(true);
	}

}

class Formulario extends JPanel{
	private JButton teste;
	
	
	 public Formulario() {
		add(new JTextField("Nome"));
		teste = new JButton("Sair");
		
		add(teste);
	}	

		
	 
	 
}
