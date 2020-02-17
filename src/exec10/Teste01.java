package exec10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Teste01 {

	public static void main(String[] args) {
		//fazer leitura de arquivo
		
		try {
			
			Scanner leitor = new Scanner(new FileReader("Entrada.txt"));
			while (leitor.hasNext()) {
				System.out.println(leitor.next());
				
			}
			
			
		} catch (FileNotFoundException e) {
			
			System.out.println("Arquivo de entrada não encontrado!");
			e.printStackTrace();
			
		}
	}

	
}
