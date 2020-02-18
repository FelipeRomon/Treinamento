package exec10;
/**
 * Classe
 * @author fcorrea
 * @sice 18/02/2020
 * @version 0.1
 */
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Teste02 {
	public static void main(String[] args) {
			
		PrintStream gravador;
		try {
			
			gravador = new PrintStream("saida.txt");
			
			gravador.println("Texto");
			gravador.println("novo texto criado");
			gravador.println("verificação");
			gravador.println("criado");
			gravador.println("fim dotexto.");
			
			gravador.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	
		
		
	}
}
