/**
 * 
 */
package gui;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author Leandro Marques
 *
 */
public class Login extends JFrame{

	/**
	 * 
	 */
	public Login() {
		super("Login");
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(3, 2));
		c.add(new JLabel("Login:"));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Login();
	}

}
