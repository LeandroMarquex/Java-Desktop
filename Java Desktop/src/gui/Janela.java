/**
 * 
 */
package gui;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author Leandro Marques
 *
 */
public class Janela extends JFrame {

	
	public Janela() {
		super("Primeira Janela");
		
		JFrame frame = new JFrame();
		
		JButton botao = new JButton();
		frame.getContentPane().add(botao);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Janela();

	}

}
