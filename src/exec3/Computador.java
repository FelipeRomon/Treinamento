package exec3;
/**
 * Classe de produto do tipo Computador
 * @author fcorrea
 * @since 11/02/2020
 * @version 0.1
 */

public class Computador extends Produto {

//	Declaraçãode variaveis
	
	String processador = "I9";
	String memoria = "32 G";
	String tela = "32\"";
	String hd = "2TB";
	String placaVideo = "RTX";
	
	
	public void exibirComputador(){
//		Modos exibição
		
		System.out.println(processador);
		System.out.println(memoria);
		System.out.println(tela);
		System.out.println(hd);
		System.out.println(placaVideo);
		ExibirTudo();
	}
	
}
