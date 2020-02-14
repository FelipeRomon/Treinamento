package exec7;
/**
 * Classe para locação de carros
 * @author fcorrea
 *@since 13/12/2020
 *@version 0.1
 */
public class Carro {
	String modeloCarro;
	String placaDoCarro;
	int velocidadeMaxima;
	String combustivel;
	double valor;
	String cor;
	boolean vendido;
	
	public Carro() {
		
	}
	
	public Carro(String modeloCarro, String placaDoCarro, int velocidadeMaxima, String combustivel, String cor, double valor) {
		this.modeloCarro = modeloCarro;
		this.placaDoCarro = placaDoCarro;
		this.velocidadeMaxima = velocidadeMaxima;
		this.combustivel = combustivel;
		this.valor = valor;
		this.cor = cor;
		this.vendido = vendido;
	}


	
}

