package projeto.gabriel.calc.visao;


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import projeto.gabriel.calc.modelo.Memoria;
import projeto.gabriel.calc.modelo.MemoriaObservador;

@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador {

	private final JLabel label;

	
	public Display() {
		Memoria.getInstancia().adicionarObservador(this);
		
		label = new JLabel(Memoria.getInstancia().getTextoAtual());
		setBackground(new Color(46, 49, 50));
		label.setForeground(Color.WHITE);
		label.setFont(new Font("courier", Font.PLAIN, 30));
		
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25));
		
		
		add(label);
		
	}
	
	@Override
	public void valorAlterado(String novoValor) {
		label.setText(novoValor);
	}
}
