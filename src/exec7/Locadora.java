package exec7;

import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit.BoldAction;

//import com.sun.java.util.jar.pack.Instruction.Switch;

/**
 * Classe responsavel por realizar as ações de uma locadora de veiculos
 * 
 * @author fcorrea
 * @since 14/02/2020
 * @version 0.6
 */

public class Locadora extends Carro {

	static Carro vetorCarro[];
	Carro variavel[];
	boolean encontrou;
	String mensagem = "";

	int posicao[] = new int[14];

//	Metodo responsavel por mostrar as opções ao usuario 
	public Locadora() {

		boolean exit = false;
		
		while (exit == false) {
			int pedido = Integer.parseInt(JOptionPane.showInputDialog(
					"Como deseja realizar a busca: \n 1 - Modelo \n 2 - Velocidade \n 3 - Combustivel \n 4 -Cor \n 5 - Mostrar todos os carros \n 6 - Comprar \n\n 0 - Sair"));

			try {
				switch (pedido) {
				case 1:
					buscarModelo();
					break;

				case 2:
					buscarVelocidade();
					break;

				case 3:
					buscarCombustivel();
					break;

				case 4:
					buscaCor();
					break;

				case 5:
					ordemPorMaiorValor(vetorCarro);
					break;

				case 6:
					compra();
					mostrarTodosCarros();
					break;
					
				case 0:
					exit = true;
					break;
					
				default:
					JOptionPane.showMessageDialog(null, "Código invalido", "X", JOptionPane.INFORMATION_MESSAGE);
					break;
				}

			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Código invalido");
				new Locadora();
			}
			
		}

		

	}
	
	
//	metodo responsavel por  buscar o modelo
	public void buscarModelo() {
		String modelo = (JOptionPane.showInputDialog("Digite o modelo do veiculo: ")).toUpperCase();
		for (int i = 0; i < vetorCarro.length; i++) {

			if (vetorCarro[i].modeloCarro.equals(modelo)) {
				mensagem = mensagem + "\n Modelo do carro: " + vetorCarro[i].modeloCarro + "\n" + "Placa: "
						+ vetorCarro[i].placaDoCarro + "\n" + "Cor: " + vetorCarro[i].cor + "\n" + "Combustivel: "
						+ vetorCarro[i].combustivel + "\n" + "Velocidade máxima: " + vetorCarro[i].velocidadeMaxima
						+ "\n" + "Valor: " + vetorCarro[i].valor + "\n";

				encontrou = true;
			}
		}

		if (!encontrou) {
			JOptionPane.showMessageDialog(null, "Veiculo não encontrado!");

		} else {
			JOptionPane.showMessageDialog(null, mensagem);

		}

	}

//	metodo responsavel por buscar por meio das velocidades	
	public void buscarVelocidade() {
		String v = JOptionPane.showInputDialog("Digite a velocidade: ");
		int velocidade = Integer.parseInt(v);
		for (int i = 0; i < vetorCarro.length; i++) {

			if (vetorCarro[i].velocidadeMaxima == velocidade) {
				mensagem = mensagem + "\n Modelo do carro: " + vetorCarro[i].modeloCarro + "\n" + "Placa: "
						+ vetorCarro[i].placaDoCarro + "\n" + "Cor: " + vetorCarro[i].cor + "\n" + "Combustivel: "
						+ vetorCarro[i].combustivel + "\n" + "Velocidade máxima: " + vetorCarro[i].velocidadeMaxima
						+ "\n" + "Valor: " + vetorCarro[i].valor + "\n";

				encontrou = true;
			}
		}

		if (!encontrou) {
			JOptionPane.showMessageDialog(null, "Veiculo não encontrado!");

		} else {
			JOptionPane.showMessageDialog(null, mensagem);

		}

	}

	public void mostrarTodosCarros() {
		String mostrar = "";
		for (int i = 0; i < vetorCarro.length; i++) {
			mostrar = mostrar + "\n Modelo do carro: " + vetorCarro[i].modeloCarro + "\n" + "Placa: "
					+ vetorCarro[i].placaDoCarro + "\n" + "Cor: " + vetorCarro[i].cor + "/n" + "Combustivel: "
					+ vetorCarro[i].combustivel + "\n" + "Velocidade máxima: " + vetorCarro[i].velocidadeMaxima + "\n"
					+ "Valor: " + vetorCarro[i].valor + "\n";
		}

		JOptionPane.showMessageDialog(null, mostrar);

	}

//	metodo responsavel por buscar por meio dos combustiveis
	public void buscarCombustivel() {
		String con = (JOptionPane.showInputDialog("Digite o tipo de combustivel: ")).toUpperCase();
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].combustivel.equals(con)) {
				mensagem = mensagem + "\n Modelo do carro: " + vetorCarro[i].modeloCarro + "\n" + "Placa: "
						+ vetorCarro[i].placaDoCarro + "\n" + "Cor: " + vetorCarro[i].cor + "/n" + "Combustivel: "
						+ vetorCarro[i].combustivel + "\n" + "Velocidade máxima: " + vetorCarro[i].velocidadeMaxima
						+ "\n" + "Valor: " + vetorCarro[i].valor + "\n";
				encontrou = true;

			}
		}
		if (!encontrou) {
			JOptionPane.showMessageDialog(null, "Veiculo não encontrado!");

		} else {
			JOptionPane.showMessageDialog(null, mensagem);

		}

	}

//	metodo responsavel por buscar por meio das cores
	public void buscaCor() {
		String cor = JOptionPane.showInputDialog("Digite a cor do veiculo: ").toUpperCase();

		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].cor.equals(cor)) {
				mensagem = mensagem + "\n Modelo do carro: " + vetorCarro[i].modeloCarro + "\n" + "Placa: "
						+ vetorCarro[i].placaDoCarro + "\n" + "Cor: " + vetorCarro[i].cor + "/n" + "Combustivel: "
						+ vetorCarro[i].combustivel + "\n" + "Velocidade máxima: " + vetorCarro[i].velocidadeMaxima
						+ "\n" + "Valor: " + vetorCarro[i].valor + "\n";
				encontrou = true;
			}
		}

		if (!encontrou) {
			JOptionPane.showMessageDialog(null, "Veiculo não encontrado!");

		} else {
			JOptionPane.showMessageDialog(null, mensagem);

		}

	}

//	metodo responsavel por ordenar os carros do mais caro para o mais barato
	public void ordemPorMaiorValor(Carro elemento[]) {
		Carro aux;
		int cont;
		for (int i = 0; i < vetorCarro.length; i++) {
			for (cont = 0; cont < (vetorCarro.length - 1); cont++) {
				if (elemento[cont].valor < elemento[cont + 1].valor) {
					aux = elemento[cont];
					elemento[cont] = elemento[cont + 1];
					elemento[cont + 1] = aux;
				}
			}
		}
		for (int a = 0; a < vetorCarro.length; a++) {
			mensagem = mensagem + "\n Modelo do carro: " + vetorCarro[a].modeloCarro + "\n" + "R$ "
					+ vetorCarro[a].valor + "\n";
		}
		JOptionPane.showMessageDialog(null, mensagem);

	}

	public void ordemPorMenorValor(Carro elemento[]) {
		Carro aux;
		int cont;
		for (int i = 0; i > vetorCarro.length; i++) {
			for (cont = 0; cont > (vetorCarro.length - 1); cont++) {
				if (elemento[cont].valor > elemento[cont + 1].valor) {
					aux = elemento[cont];
					elemento[cont] = elemento[cont + 1];
					elemento[cont + 1] = aux;
				}
			}
		}

	}

//	metodo responsavel por realizar a localizacao e as compras
	public void compra() {

		ordemPorMenorValor(vetorCarro);

		String modelo = (JOptionPane.showInputDialog("Digite o modelo do veiculo: ")).toUpperCase();
		String cor = JOptionPane.showInputDialog("Digite a cor do veiculo: ").toUpperCase();
		int j = 0;
		variavel = new Carro[14];
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].modeloCarro.equals(modelo) && vetorCarro[i].cor.equals(cor)
					&& vetorCarro[i].vendido == false) {

				mensagem = mensagem + "\n" + j + " Modelo do carro: " + vetorCarro[i].modeloCarro + "\n" + "Placa: "
						+ vetorCarro[i].placaDoCarro + "\n" + "Cor: " + vetorCarro[i].cor + "\n" + "Valor: "
						+ vetorCarro[i].valor + "\n";

				variavel[j] = vetorCarro[i];

				j++;

				encontrou = true;
			}
		}

		if (encontrou == true) {

			String v = (JOptionPane.showInputDialog(mensagem + "\n" + "Digite o numero do carro que deseja comparar: "))
					.toLowerCase();
			int venda = Integer.parseInt(v);

			if (venda <= (j - 1)) {

				confirmarCompra(variavel[venda].valor);

				variavel[venda].vendido = true;

			} else {
				JOptionPane.showMessageDialog(null, "Opção invalida!");
			}

		}
	}

//	Metodo responsavel por validar a compra
	public void confirmarCompra(double preco) {
		double valorUs = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do pagamento: "));

		if (valorUs >= preco) {

			double troco = valorUs - preco;
			JOptionPane.showMessageDialog(null, "Venda finalizada! \n Seus troco é: " + troco);

		} else {

			JOptionPane.showMessageDialog(null, "Valor insuficiente!");
		}
	}

//	metodo responsavel executar o programa Locadora
	public static void main(String[] args) {

		vetorCarro = new Carro[14];

		Carro carro1 = new Carro("GOL", "BBF3211", 150, "DIESEL", "PRETO", 3500.0, false);
		vetorCarro[0] = carro1;

		Carro carro2 = new Carro("CIVIC", "DSA3241", 189, "ALCOOL", "AZUL", 35540.0, false);
		vetorCarro[1] = carro2;

		Carro carro3 = new Carro("PEGIOTO206", "ETE2211", 200, "GAZOLINA", "PRETO", 3500.0, false);
		vetorCarro[2] = carro3;

		Carro carro4 = new Carro("PICAPE", "GDf3211", 210, "ALCOOL", "VINHO", 5700.0, false);
		vetorCarro[3] = carro4;

		Carro carro5 = new Carro("FUSCA", "DFG3211", 140, "ALCOOL", "AMARELO", 1600.0, false);
		vetorCarro[4] = carro5;

		Carro carro6 = new Carro("RX7", "BNM3411", 180, "GAZOLINA", "PRETO", 21300.0, false);
		vetorCarro[5] = carro6;

		Carro carro7 = new Carro("HB20", "WWW3211", 200, "ALCOOL", "BRANCO", 5400.0, false);
		vetorCarro[6] = carro7;

		Carro carro8 = new Carro("SUPRA", "YUI1121", 150, "GAZOLINA", "BRANCO", 44600.0, false);
		vetorCarro[7] = carro8;

		Carro carro9 = new Carro("CAMARO", "VBN3311", 450, "ALCOOL", "PRETO", 28900.0, false);
		vetorCarro[8] = carro9;

		Carro carro10 = new Carro("PALIO", "TTR3211", 150, "ALCOOL", "PRETO", 600.0, false);
		vetorCarro[9] = carro10;

		Carro carro11 = new Carro("PALIO", "TWM2200", 150, "DIESEL", "PRETO", 500.0, false);
		vetorCarro[10] = carro11;

		Carro carro12 = new Carro("CIVIC", "RJD3319", 189, "GAZOLINA", "AZUL", 3240.0, false);
		vetorCarro[11] = carro12;

		Carro carro13 = new Carro("FUSCA", "DDS2218", 140, "ALCOOL", "AMARELO", 1620.0, false);
		vetorCarro[12] = carro13;

		Carro carro14 = new Carro("SUPRA", "YUI3321", 150, "GAZOLINA", "BRANCO", 64600.0, false);
		vetorCarro[13] = carro14;

		new Locadora();
	}

}
