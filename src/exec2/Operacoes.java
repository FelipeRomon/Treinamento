package exec2;

import java.util.Scanner;

/**
 * Classe criada para demostrar opera��es
 * @author fcorrea
 *@since 11/02/2020
 *@version 0.2
 */
public class Operacoes {
	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 0;
		Scanner sc = new Scanner(System.in);
		
//		Entrada de dados
		System.out.println("Digite o primeiro numero inteiro para a opera��o: ");
		n1 = sc.nextInt();
		
		System.out.println("Digite o segundo numero inteiro para a opera��o: ");
		n2 = sc.nextInt();
		
//		Exemplo de adi��o
		int adicao = n1 + n2;
//		Exemplo de subtra��o
		int subtracao = n1 - n2;
//		Exemplo de multiplica��o
		int multiplicacao = n1 * n2;
//		Exemplo de divis�o
		int divisao = n1/n2;
//		Exemplo de modulo (Resto da divis�o inteira)
		int modulo = n1 % n2;
		
//		Mostrar resultados
		System.out.println("Adi��o: " +n1+ "+"+ n2 +" = " + adicao);
		System.out.println("Subtra��o: " +n1+ "-"+ n2 +" = "  + subtracao);
		System.out.println("Multiplica��o: " +n1+ "*"+ n2 +" = "  + multiplicacao);
		System.out.println("Divis�o: " +n1+ "/"+ n2 +" = " + divisao);
		System.out.println("Modulo: " +n1+ "%"+ n2 +" = "  + modulo);
	}
}
