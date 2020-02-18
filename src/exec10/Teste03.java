package exec10;

/**
 * @author fcorrea
 * @since 18/02/2020
 * @version 0.1
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;


public class Teste03 {

	public static void main(String[] args) {

		File arquivo = new File("saida.txt");
		
		FileOutputStream arquivoOutput;
		try {
			arquivoOutput = new FileOutputStream(arquivo, true);
			PrintStream gravador = new PrintStream(arquivoOutput);
			
			gravador.println("Texto");
			gravador.println("Texto1");
			gravador.println("Texto2");
			gravador.println("Texto3");
			gravador.println("Texto4");
			gravador.println("Texto5");
			gravador.println("Texto6");
			
			gravador.close();
			arquivoOutput.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
	}

}
