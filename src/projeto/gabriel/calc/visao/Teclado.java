package projeto.gabriel.calc.visao;

import java.awt.Button;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import projeto.gabriel.calc.modelo.Memoria;

@SuppressWarnings("serial")
public class Teclado extends JPanel implements ActionListener {
	
	private final Color CINZA_ESCURO = new Color(68, 68, 68);
	private final Color CINZA_CLARO = new Color(99, 99, 99);
	private final Color LARANJA = new Color(240, 165, 60);

	public Teclado() {
		
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		
		setLayout(layout);
		
		c.weightx = 1;
		c.weighty = 1;
		c.fill = GridBagConstraints.BOTH;
		
		// Linha 1
		c.gridwidth = 2;
		adicionarBotao("AC", CINZA_ESCURO, c, 0, 0);
		c.gridwidth = 1;
		adicionarBotao("+/-", CINZA_ESCURO, c, 2, 0);
		adicionarBotao("/", LARANJA, c, 3, 0);
		
		//Linha 2
		adicionarBotao("7", CINZA_CLARO, c, 0, 1);
		adicionarBotao("8", CINZA_CLARO, c, 1, 1);
		adicionarBotao("9", CINZA_CLARO, c, 2, 1);
		adicionarBotao("X", LARANJA, c, 3, 1);
		
		//Linha 3
		adicionarBotao("4", CINZA_CLARO, c, 0, 2);
		adicionarBotao("5", CINZA_CLARO, c, 1, 2);
		adicionarBotao("6", CINZA_CLARO, c, 2, 2);
		adicionarBotao("-", LARANJA, c, 3, 2);
		
		//Linha 4
		adicionarBotao("1", CINZA_CLARO, c, 0, 3);
		adicionarBotao("2", CINZA_CLARO, c, 1, 3);
		adicionarBotao("3", CINZA_CLARO, c, 2, 3);
		adicionarBotao("+", LARANJA, c, 3, 3);
		
		//Linha 5
		c.gridwidth = 2;
		adicionarBotao("0", CINZA_CLARO, c, 0, 4);
		c.gridwidth = 1;
		adicionarBotao(",", CINZA_CLARO, c, 2, 4);
		adicionarBotao("=", CINZA_CLARO, c, 3, 4);

	}

	private void adicionarBotao(String texto, Color cor, GridBagConstraints c, int x, int y) {
		c.gridx =x;
		c.gridy =y;
		Botao botao = new Botao(texto, cor);
		botao.addActionListener(this);
		add(botao, c);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JButton) {
			JButton botao = (JButton) e.getSource();
			Memoria.getInstancia().processarComando(botao.getText());
		}
		
	}
}
