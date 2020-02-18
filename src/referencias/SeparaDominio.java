package referencias;
/**
 * Classe que mostra a separação de partes de um emil e funções do JOptionPane
 * @author fcorrea
 * @since 17/02/2020
 * @version 0.1
 */

import javax.swing.JOptionPane;

public class SeparaDominio {

	public static void main(String[] args) {
		
		//String email = JOptionPane.showInputDialog(null,"Informe o email: ", "Validador de EMAIL", 0);
		
		//String email = JOptionPane.showInputDialog(null,"Informe o email: ", "Validador de EMAIL", 1);
		
		String email = JOptionPane.showInputDialog(null,"Informe o email: ", "Validador de EMAIL", 2);
		
		//String email = JOptionPane.showInputDialog(null,"Informe o email: ", "Validador de EMAIL", 3);
		
		//String email = JOptionPane.showInputDialog("Informe o email: ");
		
		int cont = email.indexOf("@");
		
		if(cont>0) {
			
			System.out.println("Posição do @: " + cont);
			String dominio = email.substring(cont+1);
			System.out.println("Dominio do email: " + dominio);
			
			String usuario = email.substring(0,cont);
			System.out.println("Usuario do email: " + usuario);
			
	
		}

	}

}
