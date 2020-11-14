/**
 * 
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


/**
 * @author Leandro Marques
 *
 */
public class Eventos extends JFrame implements ActionListener{
	
	
	JButton botao = new JButton("Clique Aqui");

	public Eventos() {
	
		super("Eventos");
		
		
		getContentPane().add(botao);
		botao.addActionListener(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		botao.setText("Foi Clicado");
		System.out.println("Clicou................");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Eventos();
	}

	

}
