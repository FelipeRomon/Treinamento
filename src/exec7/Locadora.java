package exec7;

import javax.swing.JOptionPane;

//import com.sun.java.util.jar.pack.Instruction.Switch;

/**
 * Classe responsavel por realizar as ações de uma locadora de veiculos
 * 
 * @author fcorrea
 * @since 14/02/2020
 * @version 0.8
 */

public class Locadora extends Carro {

	static Carro vetorCarro[];
	Carro variavel[];
	boolean encontrou;
	String mensagem = "";
	int venda;
	int contador = 0;
	boolean exit = false;

//	Metodo responsavel por mostrar as opções ao usuario 
	public Locadora() {

		while (exit == false) {
			
			try {
				String entrada = JOptionPane.showInputDialog(
						"Como deseja realizar a busca: \n 1 - Modelo \n 2 - Velocidade \n 3 - Combustivel \n 4 -Cor \n"
								+ " 5 - Mostrar todos os carros \n 6 - Comprar \n 7 - Adicionar carro \n\n 0 - Sair");
			
				
				int pedido = Integer.parseInt(entrada);
					
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

				case 7:
					adicionarCarro();
					break;

				case 0:
					exit = true;
					break;

				default:
					JOptionPane.showMessageDialog(null, "Código invalido", "X", JOptionPane.INFORMATION_MESSAGE);
					break;
				}

			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "COMANDO INVALIDO!");
				new Locadora();
			}

		}

	}

//	metodo responsavel por  buscar o modelo
	public void buscarModelo() {
		mensagem = "";
		String modelo = (JOptionPane.showInputDialog("Digite o modelo do veiculo: ")).toUpperCase();
		for (int i = 0; i < vetorCarro.length; i++) {

			if (vetorCarro[i].modeloCarro.equals(modelo) && vetorCarro[i].modeloCarro != "") {
				mensagem = mensagem + "\n Modelo do carro: " + vetorCarro[i].modeloCarro + "\n" + "Placa: "
						+ vetorCarro[i].placaDoCarro + "\n" + "Cor: " + vetorCarro[i].cor + "\n" + "Combustivel: "
						+ vetorCarro[i].combustivel + "\n" + "Velocidade máxima: " + vetorCarro[i].velocidadeMaxima
						+ "\n" + "Valor: " + vetorCarro[i].valor + "\n" + "Carro comprado: " + vetorCarro[i].vendido
						+ "\n";

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
		mensagem = "";
		String v = JOptionPane.showInputDialog("Digite a velocidade: ");
		int velocidade = Integer.parseInt(v);
		for (int i = 0; i < vetorCarro.length; i++) {

			if (vetorCarro[i].velocidadeMaxima == velocidade && vetorCarro[i].velocidadeMaxima != 0) {
				mensagem = mensagem + "\n Modelo do carro: " + vetorCarro[i].modeloCarro + "\n" + "Placa: "
						+ vetorCarro[i].placaDoCarro + "\n" + "Cor: " + vetorCarro[i].cor + "\n" + "Combustivel: "
						+ vetorCarro[i].combustivel + "\n" + "Velocidade máxima: " + vetorCarro[i].velocidadeMaxima
						+ "\n" + "Valor: " + vetorCarro[i].valor + "\n" + "Carro comprado: " + vetorCarro[i].vendido
						+ "\n";

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
			if (vetorCarro[i].modeloCarro != "") {
				mostrar = mostrar + "\n Modelo do carro: " + vetorCarro[i].modeloCarro + "\n" + "Placa: "
						+ vetorCarro[i].placaDoCarro + "\n" + "Cor: " + vetorCarro[i].cor + "\n" + "Combustivel: "
						+ vetorCarro[i].combustivel + "\n" + "Velocidade máxima: " + vetorCarro[i].velocidadeMaxima
						+ "\n" + "Valor: " + vetorCarro[i].valor + "\n" + "Carro comprado: " + vetorCarro[i].vendido
						+ "\n";
			}
		}

		JOptionPane.showMessageDialog(null, mostrar);

	}

//	metodo responsavel por buscar por meio dos combustiveis
	public void buscarCombustivel() {
		mensagem = "";
		String con = (JOptionPane.showInputDialog("Digite o tipo de combustivel: ")).toUpperCase();
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].combustivel.equals(con) && !con.contentEquals("")) {
				mensagem = mensagem + "\n Modelo do carro: " + vetorCarro[i].modeloCarro + "\n" + "Placa: "
						+ vetorCarro[i].placaDoCarro + "\n" + "Cor: " + vetorCarro[i].cor + "\n" + "Combustivel: "
						+ vetorCarro[i].combustivel + "\n" + "Velocidade máxima: " + vetorCarro[i].velocidadeMaxima
						+ "\n" + "Valor: " + vetorCarro[i].valor + "\n" + "Carro comprado: " + vetorCarro[i].vendido
						+ "\n";
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
		mensagem = "";
		String cor = JOptionPane.showInputDialog("Digite a cor do veiculo: ").toUpperCase();

		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].cor.equals(cor) && vetorCarro[i].cor != "") {
				mensagem = mensagem + "\n Modelo do carro: " + vetorCarro[i].modeloCarro + "\n" + "Placa: "
						+ vetorCarro[i].placaDoCarro + "\n" + "Cor: " + vetorCarro[i].cor + "\n" + "Combustivel: "
						+ vetorCarro[i].combustivel + "\n" + "Velocidade máxima: " + vetorCarro[i].velocidadeMaxima
						+ "\n" + "Valor: " + vetorCarro[i].valor + "\n" + "Carro comprado: " + vetorCarro[i].vendido
						+ "\n";
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
		mensagem = "";
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
			if (vetorCarro[a].modeloCarro != "" && vetorCarro[a].valor != 0)
				mensagem = mensagem + "\n Modelo do carro: " + vetorCarro[a].modeloCarro + "\n" + "R$ "
						+ vetorCarro[a].valor + "\n" + "Carro comprado: " + vetorCarro[a].vendido + "\n";
		}
		JOptionPane.showMessageDialog(null, mensagem);

	}

	public void ordemPorMenorValor(Carro elemento[]) {
		Carro aux;
		int cont;
		mensagem = "";
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
		mensagem = "";
		ordemPorMenorValor(vetorCarro);

		String modelo = (JOptionPane.showInputDialog("Digite o modelo do veiculo: ")).toUpperCase();
		String cor = JOptionPane.showInputDialog("Digite a cor do veiculo: ").toUpperCase();
		int j = 0;
		encontrou = false;
		variavel = new Carro[11];
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].modeloCarro.equals(modelo) && vetorCarro[i].cor.equals(cor)
					&& vetorCarro[i].vendido == false) {

				mensagem = mensagem + "\n" + j + " Modelo do carro: " + vetorCarro[i].modeloCarro + "\n" + "Placa: "
						+ vetorCarro[i].placaDoCarro + "\n" + "Cor: " + vetorCarro[i].cor + "\n" + "Valor: "
						+ vetorCarro[i].valor + "\n" + "Carro comprado: " + vetorCarro[i].vendido + "\n";

				variavel[j] = vetorCarro[i];

				j++;

				encontrou = true;
			}
		}

		if (encontrou == true) {

			String v = (JOptionPane.showInputDialog(mensagem + "\n" + "Digite o numero do carro que deseja comparar: "))
					.toLowerCase();
			venda = Integer.parseInt(v);

			if (venda <= (j - 1)) {
				confirmarCompra(variavel[venda].valor);
			}

		} else {
			JOptionPane.showMessageDialog(null, "Veiculo indisponivel!");

		}
	}

//	Metodo responsavel por validar a compra
	public void confirmarCompra(double preco) {
		mensagem = "";
		double valorUs = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do pagamento: "));

		if (valorUs >= preco) {

			double troco = valorUs - preco;
			JOptionPane.showMessageDialog(null, "Venda finalizada! \n Seus troco é: " + troco);
			variavel[venda].vendido = true;

		} else {

			JOptionPane.showMessageDialog(null, "Valor insuficiente!");
		}
	}

//	Metodo responsavel por adicionar carros
	public void adicionarCarro() {

		String modelo = JOptionPane.showInputDialog("Digite o modelo do carro: ").toUpperCase();
		String placa = JOptionPane.showInputDialog("Digite a placa do carro: ").toUpperCase();
		int velocidade = Integer.parseInt(JOptionPane.showInputDialog("Digite velocidade do carro: "));
		String combustivel = JOptionPane.showInputDialog("Digite o combustivel do carro: ").toUpperCase();
		String cor = JOptionPane.showInputDialog("Digite a cor do carro: ").toUpperCase();
		double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do carro: "));

		Carro novoCarro = new Carro(modelo, placa, velocidade, combustivel, cor, preco, false);
		Carro carroErrado = new Carro();

		if (novoCarro != carroErrado) {
			vetorCarro[14 + contador] = novoCarro;

			contador++;

			JOptionPane.showMessageDialog(null, "Carro adicionado com sucesso!");
		}else {
			JOptionPane.showMessageDialog(null, "Carro não adicionado! \nFalata de informações.");
		}

	}

//	metodo responsavel executar o programa Locadora
	public static void main(String[] args) {

		vetorCarro = new Carro[21];

		Carro carro1 = new Carro("GOL", "BBF3211", 150, "DIESEL", "PRETO", 3500.0, false);
		vetorCarro[0] = carro1;

		Carro carro2 = new Carro("CIVIC", "DSA3241", 189, "ALCOOL", "AZUL", 35540.0, false);
		vetorCarro[1] = carro2;

		Carro carro3 = new Carro("CIVIC", "TRE4432", 189, "ALCOOL", "AZUL", 32740.0, false);
		vetorCarro[2] = carro3;

		Carro carro4 = new Carro("PICAPE", "GDf3211", 210, "ALCOOL", "VINHO", 5700.0, false);
		vetorCarro[3] = carro4;

		Carro carro5 = new Carro("FUSCA", "DFG6611", 140, "ALCOOL", "AMARELO", 1600.0, false);
		vetorCarro[4] = carro5;

		Carro carro6 = new Carro("RX7", "BNM3411", 180, "GASOLINA", "PRETO", 21300.0, false);
		vetorCarro[5] = carro6;

		Carro carro7 = new Carro("FUSCA", "DDS2218", 140, "ALCOOL", "AMARELO", 1650.0, false);
		vetorCarro[6] = carro7;

		Carro carro8 = new Carro("FUSCA", "GGD2342", 140, "ALCOOL", "AMARELO", 1620.0, false);
		vetorCarro[7] = carro8;

		Carro carro9 = new Carro("CAMARO", "VBN3311", 450, "ALCOOL", "PRETO", 28900.0, false);
		vetorCarro[8] = carro9;

		Carro carro10 = new Carro("PALIO", "TTR3211", 150, "ALCOOL", "PRETO", 600.0, false);
		vetorCarro[9] = carro10;

		Carro carro11 = new Carro("PALIO", "TWM2200", 150, "DIESEL", "PRETO", 500.0, false);
		vetorCarro[10] = carro11;

		Carro carro12 = new Carro("", "", 0, "", "", 0, true);
		vetorCarro[11] = carro12;

		Carro carro13 = new Carro("", "", 0, "", "", 0, true);
		vetorCarro[12] = carro13;

		Carro carro14 = new Carro("", "", 0, "", "", 0, true);
		vetorCarro[13] = carro14;

		Carro carro15 = new Carro("", "", 0, "", "", 0, true);
		vetorCarro[14] = carro15;

		Carro carro16 = new Carro("", "", 0, "", "", 0, true);
		vetorCarro[15] = carro16;

		Carro carro17 = new Carro("", "", 0, "", "", 0, true);
		vetorCarro[16] = carro17;

		Carro carro18 = new Carro("", "", 0, "", "", 0, true);
		vetorCarro[17] = carro18;

		Carro carro19 = new Carro("", "", 0, "", "", 0, true);
		vetorCarro[18] = carro19;

		Carro carro20 = new Carro("", "", 0, "", "", 0, true);
		vetorCarro[19] = carro20;

		Carro carro21 = new Carro("", "", 0, "", "", 0, true);
		vetorCarro[20] = carro21;

		new Locadora();
	}

}
