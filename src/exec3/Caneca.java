package exec3;
/**
 * Classe de produto do tipo Caneta
 * @author fcorrea
 * @since 11/02/2020
 * @version 0.1
 */
public class Caneca extends Produto{
	
//	Variaveis
	boolean estampa = false;
	String material = null;
	int medida = 0;
	
	public void exibirCaneca(){
		
//		if e else para checar as variaveis
		if(estampa != false){
			System.out.println("O tipo da estampa �: " + estampa);
		}else{
			System.out.println("A caneca n�o possui estampa.");
		}
		
		if(material != null){
			System.out.println("O material da caneca �: " + material);
		}else{
			System.out.println("Coloque um material.");
		}
		if(medida > 100){
			System.out.println("O material da caneca �: " + medida);
		}else{
			System.out.println("Tamanho invalido.");
		}
		ExibirTudo();
		
	}
}
