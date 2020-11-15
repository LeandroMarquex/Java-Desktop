/**
 * 
 */
package gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 * @author Leandro Marques
 *
 */
public class Eventos extends JFrame implements ActionListener{
	
	
	JButton botao = new JButton("Clique Aqui");

	public Eventos() {
	
		super("Eventos");
		
		JLabel simples = new JLabel("Label Teste");
		simples.setToolTipText("Meu label");
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(simples);
		

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		
		/*
		getContentPane().add(botao);
		botao.addActionListener(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		*/
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
