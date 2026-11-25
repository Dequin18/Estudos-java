package APIs_Graficas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.net.NoRouteToHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Teste {
JFrame telaInicial;
JPanel PainelIiniciao, subpainel, subpainel2, subpainel3;
JLabel op1, op2;
JTextField opc1, opc2;
JMenuBar BARRAMENU;
JMenu MenuInicial;
JMenuItem opt1, opt2;
JButton btnSalvar, btnExibir;

public Teste () {
	telaInicial = new JFrame();	
	telaInicial.setVisible(true);

	btnSalvar = new JButton("Salvar");
	btnExibir = new JButton("Exibir");
	PainelIiniciao = new JPanel();
	subpainel = new JPanel();
	subpainel2 = new JPanel();
	subpainel3 = new JPanel();
	op1 = new JLabel("Nome");
	op2 = new JLabel("Email");
	opc1 = new JTextField(15);
	opc2 = new JTextField(15);
	BARRAMENU = new JMenuBar();
	MenuInicial = new JMenu("OPtions");
	opt1 = new JMenuItem("options 1");
	opt2 = new JMenuItem("options 2");
	
	subpainel3.add(btnExibir);
	subpainel3.add(btnSalvar);
	PainelIiniciao.setLayout(new BorderLayout());
	subpainel.add(op1);
	subpainel.add(opc1);
	subpainel2.add(op2);
	subpainel2.add(opc2);
	telaInicial.setJMenuBar(BARRAMENU);
	BARRAMENU.add(MenuInicial);
	MenuInicial.add(opt1);
	MenuInicial.add(opt2);
	PainelIiniciao.add(subpainel, BorderLayout.CENTER);
	PainelIiniciao.add(subpainel3, BorderLayout.SOUTH);
	PainelIiniciao.add(subpainel2, BorderLayout.NORTH);
	telaInicial.add(PainelIiniciao);
	telaInicial.setLocationRelativeTo(PainelIiniciao);
	telaInicial.setLayout(new BorderLayout());
	telaInicial.add(PainelIiniciao, BorderLayout.NORTH);
	telaInicial.pack();
}
	
	public static void main(String[] args) {
Teste t1 = new Teste();
		
		
		
		

	}

}
