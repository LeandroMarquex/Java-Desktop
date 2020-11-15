/**
 * 
 */
package gui;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * @author Leandro Marques
 *
 */
public class Login extends JFrame{

	JButton logar, cancelar;
	
	public Login() {
		super("Login");
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(3, 2));
		c.add(new JLabel("Login:"));
		c.add(new JTextField());
		c.add(new JLabel("Senha:"));
		c.add(new JPasswordField());
		c.add(new JButton("Logar:"));
		c.add(new JButton("Cancelar:"));
		
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
