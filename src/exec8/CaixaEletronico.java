package exec8;

/**
 * @author fcorrea
 * @sice 17/02/202
 * @version 0.3
 */
import javax.swing.JOptionPane;

public class CaixaEletronico {// inicio da classe

	public static void main(String[] args) {// inicio do método main

		// Declaração das variáveis utilizadas no programa
		int valorSacado = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor", "Calculadora", 1));
		int notaCinquenta = 0;
		int notaVinte = 0;
		int notaDez = 0;
		int notaCinco = 0;
		int notaDois = 0;

		// Inicio dos condicionais para calculo de notas
		if (valorSacado == 103) {
			notaCinquenta = 1;
			notaVinte = 2;
			notaCinco = 1;
			notaDois = 4;
			valorSacado = (valorSacado - 103);
					

		}
		
		else if(valorSacado <= 1) {
			JOptionPane.showMessageDialog(null, "Impossível sacar!", "NOTAS LIBERADAS",
					JOptionPane.INFORMATION_MESSAGE);
		
		}

		if (valorSacado == 53) {
			notaVinte = 2;
			notaCinco = 1;
			notaDois = 4;
			valorSacado = (valorSacado - 53);


		} else if (valorSacado >= 50) {
			notaCinquenta = (valorSacado / 50);
			valorSacado = (valorSacado - (notaCinquenta * 50));
		

		}
		if (valorSacado == 43) {
			notaVinte = 1;
			notaDez = 1;
			notaCinco = 1;
			notaDois = 4;
			valorSacado = (valorSacado - 43);
			
					
		}
		if (valorSacado == 23) {
			notaDez = 1;
			notaCinco = 1;
			notaDois = 4;
			valorSacado = valorSacado - 23;


		} else if (valorSacado >= 20) {
			notaVinte = (valorSacado / 20);
			valorSacado = (valorSacado - (notaVinte * 20));
			

		}
		if (valorSacado == 13) {
			notaCinco = 1;
			notaDois = 4;
			valorSacado = valorSacado - 13;
			
			
		} else if (valorSacado >= 10) {
			notaDez = (valorSacado / 10);
			valorSacado = (valorSacado - (notaDez * 10));
				
		}
		
		

		switch (valorSacado) {
		
		case 9:
			notaCinco = 1;
			notaDois = 2;
			break;
		
		case 8:
			notaDois = 4;
			break;

		case 7:
			notaCinco = 1;
			notaDois = 1;
			break;

		case 6:
			notaDois = 3;
			break;

		case 5:
			notaCinco = 1;
			break;
		
		case 4:
			notaDois = 2;
			break;

		case 3:
			notaDois = 1;
			break;
		
		case 2:
			notaDois = 1;
			break;
			
		}

		JOptionPane.showMessageDialog(null,
				"Nota(s) de 50 - " + +notaCinquenta + "\n" + "Nota(s) de 20 - " + notaVinte + "\n"
						+ "Nota(s) de 10 - " + notaDez + "\n" + "Nota(s) de 5 - " + notaCinco + "\n"
						+ "Nota(s) de 2 - " + notaDois + "\n",
				"NOTAS LIBERADAS", JOptionPane.INFORMATION_MESSAGE);

	}// fim do método main

}// fim da classe
