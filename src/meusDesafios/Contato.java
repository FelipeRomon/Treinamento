package meusDesafios;
/**
 * Classe para resolver o ex 5 da lista 3
 * @author fcorrea
 * @since 11/02/2020
 * @version 0.2
 */

	public class Contato{
//		Criação das variaveis 
		private String nome;
		private String email;
		
		
		public Contato(String nome, String email){
			
//		get e set das variaves privadas
			this.nome = nome;
			this.email = email;
		}
		
		public String getNome(){
			return this.nome;
		}
		
		public String getEmail(){
			return this.email;
		}
		
		public void setNome(String nome){
			this.nome = nome;
		}
		
		public void setEmail(String email){
			this.email = email;
		}
		
	}