package exec3;
/**
 * Essa Classe � responsavel por armazenas os atributos e m�todos de Produto
 * @author fcorrea
 * @since 11/02/2020
 * @version 0.1
 */

public class Produto {
			
//	Cria��o das variaveis
	public String nome;
	public double quantidade = 0;
	public double custo = 0;
	public int quantidaDeVendida = 0;
	public double percentualDeLucro = 0;
	
//	 Metodos
	
//	Tratando com if - else
	public void ExibirNome(){
		if (nome != null) {
			System.out.println(nome);
		}else{
			System.out.println("Nome n�o adicionado.");
		}
	}
	
	public void ExibirValor(){
		if (custo > 0 && percentualDeLucro > 0){
		System.out.println(custo +(custo * percentualDeLucro/100));
		}else{
			System.out.println("Valor invalido.");
		}
	}
	
	public void ExibirLucro(){
		if(custo > 0 && percentualDeLucro > 0){
		System.out.println(custo * percentualDeLucro/100);
		}else{
			System.out.println("Valor invalido.");
		}
	}
	
	public void ExibirTudo(){
		ExibirNome();
		ExibirValor();
		ExibirLucro();
	}
}
