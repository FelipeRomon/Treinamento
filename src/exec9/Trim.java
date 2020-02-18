package exec9;
/**
 * Classe para demostrar o funcionamento do metodo trim
 * @author fcorrea
 *@since 17/02/2020
 *@version 0.1
 */
public class Trim {

	public static void main(String[] args) {
		
		String um = "Ol� ";
		String dois = "Mundo ";
		
		System.out.println("Antes do trim: " + um + dois + ".");
		
		//Retirando os espa�os vazios 
		um = um.trim();
		dois = dois.trim();
		System.out.println("Depois do trim: " + um + dois + ".");

	}

}
