package projeto.gabriel.calc.visao;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class calculadora extends JFrame{
	

	public calculadora() {
		
		organizarLayout();
		
		setTitle("Calculadora");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 500);
		setLocationRelativeTo(null);
		setVisible(true);
		
		
	}
	
	
	private void organizarLayout() {
		setLayout(new BorderLayout());
		
		Display display = new Display();
		display.setPreferredSize(new Dimension(233, 70));
		add(display, BorderLayout.NORTH);
		
		Teclado teclado = new Teclado();
		add(teclado, BorderLayout.CENTER);
		
	}

	public static void main(String[] args) {
		new calculadora();
	}
}
