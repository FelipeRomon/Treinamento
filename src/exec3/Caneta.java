package exec3;
/**
 * Classe de produto do tipo Caneta
 * @author fcorrea
 * @since 11/02/2020
 * @version 0.1
 */
public class Caneta extends Produto {
//	Variaveis 
	String cor = null;
	String formato = null;
	String marca = null;
	
	public void exibirCaneta(){
//		if e else para checar as variaveis
		if(cor != null){
			System.out.println("A cor da caneta é: " + cor);
		}else{
			System.out.println("Coloque uma cor.");
		}
		
		if(formato != null){
			System.out.println("O formato é: " + formato);
		}else{
			System.out.println("Coloque um formato.");
		}
		
		if(marca != null){
			System.out.println("A marca da caneta é: " + marca);
		}else{
			System.out.println("Coloque uma marca.");
		}
		
		ExibirTudo();
	}
}
