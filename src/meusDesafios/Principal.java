package meusDesafios;
/**
 * Classe que contem o metodo main para o exercicio 5 da lista 3
 * @author fcorrea
 * @since 11/02/2020
 * @version 0.1
 */

public class Principal extends Agenda {


	public Principal(String nome, String email) {
		super(nome, email);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
		Contato ana = new Contato ("Ana Paula", "Email@01");
		contatos.add(ana);
		System.out.println(ana.getNome());
		System.out.println(ana.getEmail());
			//Scanner sc = new Scanner(System.in);
			//System.out.println("Digite seu nome:");
		
		Contato paulo = new Contato ("Paulo Matos", "Email@02");
		contatos.add(paulo);
		System.out.println(paulo.getNome());
		System.out.println(paulo.getEmail());
		
		contatos.remove(ana);
		
		System.out.println();
		

	}

}
