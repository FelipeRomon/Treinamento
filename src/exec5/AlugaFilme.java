package exec5;
/**
 * Casse responsavel pelo aluguel dos filmes
 * @author fcorrea
 * @since 12/02/2020
 * @version 0.1
 */
import java.util.Scanner;

public class AlugaFilme {


//		Variaveis
		int dias;
		double valorAlu;
		double valorPago;
		String filmeDesejado;
		boolean inception = true;
		boolean stolen = true;
		Scanner sc = new Scanner(System.in);
		
//		Verificar se o filme está disponivel
		public boolean verificaDisponibilidade(){
			
			System.out.println("Digite o numero do fileme desejado:\n 1- Inception \n 2- Stolen");
			String filmeD = sc.nextLine();
			
			if (filmeD.equals("1")){
				if(inception){
					return true;
				}else{
					return false;
				}
			}if(filmeD.equals("2")){
				if(stolen){
					return true;
				}else{
					return false;
				}
			}else{
				return false; 
			}
		}

		
//		Calculo do aluguel
		public void calculo(){
			if (verificaDisponibilidade()){
				System.out.println("Quantos dias você deseja alugar:");
				dias = sc.nextInt();
				valorAlu = dias * 2.30;
				System.out.printf("O valor do seu aluguel é: R$ %.2f\n", valorAlu);
				System.out.println("Incira o pagamento: ");
				valorPago = sc.nextDouble();
				
				if(valorPago<valorAlu){
					System.out.println("Valor pago insuficiente!");
				}else{
					if(valorPago>valorAlu) {
						System.out.printf("Seu troco é: R$  %.2f\n", (valorPago - valorAlu));
						System.out.println("Filme alugado com sucesso!");
					}else {
						System.out.println("Filme alugado com sucesso!");
					}
					
				}
			}else{
				System.out.println("Filme não disponivel!");
			}
		}

		
//		Contrutor da classe
		public AlugaFilme() {
	
			calculo();
		}
		
//		Metodo executavel
		public static void main(String[] args) {
			new AlugaFilme();
		}
		
			
		
	}
		
