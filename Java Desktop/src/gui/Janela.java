/**
 * 
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author Leandro Marques
 *
 */
public class Janela extends JFrame {

	
	public Janela() {
		
		super("Primeira Janela");
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		Container c2 = new JPanel();
		c2.setLayout(new GridLayout(4,1));
		c2.add(new JButton("OK"));
		c2.add(new JButton("Cancelar"));
		c2.add(new JButton("Delete"));
		c2.add(new JButton("Ajuda"));
		
	//	c.add(BorderLayout.NORTH,new JButton("Centro"));
		c.add(BorderLayout.EAST,c2);
	
	
		
		
		
		/*
		c.setLayout(new GridLayout(2,3));
		
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		c.add(new JButton("4"));
		c.add(new JButton("5"));
		c.add(new JButton("6"));
		*/
		
		/*
		c.setLayout(new FlowLayout());
		
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		 */
		
	//	BorderLayout borderLayout = new BorderLayout();
		
		/*	
		c.add(BorderLayout.NORTH,new JButton("1"));
		c.add(BorderLayout.SOUTH,new JButton("2"));
		c.add(BorderLayout.CENTER,new JButton("3"));
		c.add(BorderLayout.EAST,new JButton("4"));
		c.add(BorderLayout.WEST,new JButton("5"));
		 */
		
		JButton botao = new JButton();
		getContentPane().add(botao);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Janela();

	}

}