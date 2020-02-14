package exec2;

import java.util.Scanner;

/**
 * Classe criada para demostrar operações
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
		System.out.println("Digite o primeiro numero inteiro para a operação: ");
		n1 = sc.nextInt();
		
		System.out.println("Digite o segundo numero inteiro para a operação: ");
		n2 = sc.nextInt();
		
//		Exemplo de adição
		int adicao = n1 + n2;
//		Exemplo de subtração
		int subtracao = n1 - n2;
//		Exemplo de multiplicação
		int multiplicacao = n1 * n2;
//		Exemplo de divisão
		int divisao = n1/n2;
//		Exemplo de modulo (Resto da divisão inteira)
		int modulo = n1 % n2;
		
//		Mostrar resultados
		System.out.println("Adição: " +n1+ "+"+ n2 +" = " + adicao);
		System.out.println("Subtração: " +n1+ "-"+ n2 +" = "  + subtracao);
		System.out.println("Multiplicação: " +n1+ "*"+ n2 +" = "  + multiplicacao);
		System.out.println("Divisão: " +n1+ "/"+ n2 +" = " + divisao);
		System.out.println("Modulo: " +n1+ "%"+ n2 +" = "  + modulo);
	}
}
