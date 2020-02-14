package exec3;
/**
 * Classe de produto do tipo Carro
 * @author fcorrea
 * @since 11/02/2020
 * @version 0.1
 */
public class Carro extends Produto {
//	Variaveis
	String marca = null;
	String modelo = null;
	int ano = 0;
	String cor = null;
	double motor = 0.0;
	
	
public void exibirCarro(){
//	if e else para checar as variaveis
	if(marca != null){
		System.out.println("A marca do carro é: " + marca);
	}else{
		System.out.println("Marca invalida");
	}
	
	if(modelo != null){
		System.out.println("Seu modelo é " + modelo);
	}else{
		System.out.println("Coloque um modelo.");
	}
	
	if(ano>1900){
		System.out.println("O ano de fabricação é: " + ano);
	}else{
		System.out.println("Ano invaido.");
	}
	
	if(cor != null){
		System.out.println("Cor: " + cor);
	}else{
		System.out.println("Coloque uma cor!");
	}
	
	if(motor > 0.9){
		System.out.println("A potencia do motor é: " + motor);
	}else{
		System.out.println("Potencia invalida");
	}
	
	ExibirTudo();
}

}
