package exec7;

import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit.BoldAction;

//import com.sun.java.util.jar.pack.Instruction.Switch;

/**
 * Classe responsavel por realizar as ações de uma locadora de veiculos
 * @author fcorrea
 * @since 14/02/2020
 * @version 0.6
 */

public class Locadora extends Carro {

	static Carro vetorCarro[];
	boolean encontrou;
	String mensagem = "";

//	Metodo responsavel por mostrar as opções ao usuario 
	public Locadora() {

		int pedido = Integer.parseInt(JOptionPane.showInputDialog(
				"Como deseja realizar a busca: \n 1 - Modelo \n 2 - Velocidade \n 3 - Combustivel \n 4 -Cor \n 5 - Mostrar todos os carros \n 6 - Comprar"));

//		if (pedido == 1) {
//			buscarModelo();
//		} else if (pedido == 2) {
//			buscarVelocidade();
//		} else if (pedido == 3) {
//			buscarCombustivel();
//		} else if (pedido == 4) {
//			buscaCor();
//		} else {
//			JOptionPane.showMessageDialog(null, "Código invalido", "X", JOptionPane.INFORMATION_MESSAGE);
//		}

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
			break;
			
		default:
			JOptionPane.showMessageDialog(null, "Código invalido", "X", JOptionPane.INFORMATION_MESSAGE);
			break;
		}
	
	}
	

	
//	metodo responsavel por  buscar o modelo
	public void buscarModelo(){
		String modelo = (JOptionPane.showInputDialog("Digite o modelo do veiculo: ")).toUpperCase();
		for (int i = 0; i < vetorCarro.length; i++) {

			if (vetorCarro[i].modeloCarro.equals (modelo)) {
				mensagem = mensagem + "\n Modelo do carro: " + vetorCarro[i].modeloCarro + "\n" + "Placa: " + vetorCarro[i].placaDoCarro +
						"\n" + "Cor: " + vetorCarro[i].cor + "/n" + "Combustivel: " + vetorCarro[i].combustivel + "\n" +
						"Velocidade máxima: " + vetorCarro[i].velocidadeMaxima + "\n" + "Valor: " + vetorCarro[i].valor + "\n";

				encontrou = true;
			}
		}
		
		if (!encontrou){
			JOptionPane.showMessageDialog(null, "Veiculo não encontrado!");
			
		}else {
			JOptionPane.showMessageDialog(null, mensagem);
			
		}
				
	}
			
			
			
//	metodo responsavel por buscar por meio das velocidades	
	public void buscarVelocidade() {
		String v = JOptionPane.showInputDialog("Digite a velocidade: ");
		int velocidade = Integer.parseInt(v);
		for (int i = 0; i < vetorCarro.length; i++) {
			
		
			if (vetorCarro[i].velocidadeMaxima == velocidade) {
				mensagem = mensagem + "\n Modelo do carro: " + vetorCarro[i].modeloCarro + "\n" + "Placa: " + vetorCarro[i].placaDoCarro +
						"\n" + "Cor: " + vetorCarro[i].cor + "/n" + "Combustivel: " + vetorCarro[i].combustivel + "\n" +
						"Velocidade máxima: " + vetorCarro[i].velocidadeMaxima + "\n" + "Valor: " + vetorCarro[i].valor + "\n";
				
				encontrou = true;
			}
		}
		
		if (!encontrou){
			JOptionPane.showMessageDialog(null, "Veiculo não encontrado!");
			
		}else {
			JOptionPane.showMessageDialog(null, mensagem);
			
		}
				
	}
			
			
	
//	metodo responsavel por buscar por meio dos combustiveis
	public void buscarCombustivel() {
		String con = (JOptionPane.showInputDialog("Digite o tipo de combustivel: ")).toUpperCase();
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].combustivel.equals(con)) {
				mensagem = mensagem + "\n Modelo do carro: " + vetorCarro[i].modeloCarro + "\n" + "Placa: " + vetorCarro[i].placaDoCarro +
						"\n" + "Cor: " + vetorCarro[i].cor + "/n" + "Combustivel: " + vetorCarro[i].combustivel + "\n" +
						"Velocidade máxima: " + vetorCarro[i].velocidadeMaxima + "\n" + "Valor: " + vetorCarro[i].valor + "\n";
				encontrou = true;

			}
		}
		if (!encontrou){
			JOptionPane.showMessageDialog(null, "Veiculo não encontrado!");
			
		}else {
			JOptionPane.showMessageDialog(null, mensagem);
			
		}
				
	}
	
//	metodo responsavel por buscar por meio das cores
	public void buscaCor() {
		String cor = JOptionPane.showInputDialog("Digite a cor do veiculo: ").toUpperCase();

		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].cor.equals(cor)) {
				mensagem = mensagem + "\n Modelo do carro: " + vetorCarro[i].modeloCarro + "\n" + "Placa: " + vetorCarro[i].placaDoCarro +
						"\n" + "Cor: " + vetorCarro[i].cor + "/n" + "Combustivel: " + vetorCarro[i].combustivel + "\n" +
						"Velocidade máxima: " + vetorCarro[i].velocidadeMaxima + "\n" + "Valor: " + vetorCarro[i].valor + "\n";
				encontrou = true;
			}
		}
		
		if (!encontrou){
			JOptionPane.showMessageDialog(null, "Veiculo não encontrado!");
			
		}else {
			JOptionPane.showMessageDialog(null, mensagem);
			
		}
				
	}
	
//	metodo responsavel por ordenar os carros do mais caro para o mais barato
	public void ordemPorMaiorValor(Carro elemento[]) {
		Carro aux;
		int cont;
		for (int i= 0; i < vetorCarro.length; i++) {
			for (cont = 0; cont < (vetorCarro.length -1); cont++) {
				if (elemento[cont].valor < elemento[cont +1].valor) {
					aux = elemento[cont];
					elemento[cont] = elemento[cont+1];
					elemento[cont+1] = aux;		
				}
			}	
		}
		for (int a = 0; a < vetorCarro.length; a++) {
			mensagem = mensagem + "\n Modelo do carro: " + vetorCarro[a].modeloCarro +
					"\n" + "R$ " + vetorCarro[a].valor +"\n";
		}
		JOptionPane.showMessageDialog(null, mensagem);
		
	}
	
	
	
	public void ordemPorMenorValor(Carro elemento[]) {
		Carro aux;
		int cont;
		for (int i= 0; i > vetorCarro.length; i++) {
			for (cont = 0; cont > (vetorCarro.length -1); cont++) {
				if (elemento[cont].valor < elemento[cont +1].valor) {
					aux = elemento[cont];
					elemento[cont] = elemento[cont+1];
					elemento[cont+1] = aux;		
				}
			}	
		}
		for (int a = 0; a < vetorCarro.length; a++) {
			mensagem = mensagem + "\n Modelo do carro: " + vetorCarro[a].modeloCarro +
					"\n" + "R$ " + vetorCarro[a].valor +"\n";
		}
		JOptionPane.showMessageDialog(null, mensagem);
		
	}
	
	
	
//	metodo responsavel por realizar a localizacao e as compras
	public void compra() {
	
		String modelo = (JOptionPane.showInputDialog("Digite o modelo do veiculo: ")).toUpperCase();
		String cor = JOptionPane.showInputDialog("Digite a cor do veiculo: ").toUpperCase();
		
		for (int i = 0; i < vetorCarro.length; i++) {
			
			if(vetorCarro[i].modeloCarro.equals(modelo) && vetorCarro[i].cor.equals(cor)) {	
				
				mensagem = mensagem + "\n Modelo do carro: " + vetorCarro[i].modeloCarro +
						"\n" + "R$ " + vetorCarro[i].valor +"\n" + "Valor: " + vetorCarro[i].valor + "\n";
				
				encontrou = true;	
			}
		}
		
		if(encontrou == true) {
			
			String v = (JOptionPane.showInputDialog(mensagem + "Deseja comprar algum dos carros? true/false")).toLowerCase();
			boolean venda = Boolean.parseBoolean(v);
			if (venda == true) {
				
				
			}
			
		}if (!encontrou) {
			JOptionPane.showMessageDialog(null, "Veiculo não encontrado!");		
		}
		
		
		
	}
	
	
//	metodo responsavel executar o programa Locadora
	public static void main(String[] args) {

		vetorCarro = new Carro[10];

		Carro carro1 = new Carro("GOL", "BBF-3211", 150, "DIESEL","PRETO", 2400.0);
		vetorCarro[0] = carro1;

		Carro carro2 = new Carro("CIVIC", "DSA-3241", 189, "ALCOOL","AZUL", 3240.0);
		vetorCarro[1] = carro2;

		Carro carro3 = new Carro("PEGIOTO206", "ETE-2211", 200, "GAZOLINA","PRETO", 3500.0);
		vetorCarro[2] = carro3;

		Carro carro4 = new Carro("PICAPE", "GDf-3211", 210, "ALCOOL","VINHO", 5700.0);
		vetorCarro[3] = carro4;

		Carro carro5 = new Carro("FUSCA", "DFG-3211", 140, "ALCOOL","AMARELO", 1600.0);
		vetorCarro[4] = carro5;

		Carro carro6 = new Carro("RX7", "BNM-3411", 180, "GAZOLINA","PRETO", 21300.0);
		vetorCarro[5] = carro6;

		Carro carro7 = new Carro("HB20", "WWW-3211", 200, "ALCOOL","BRANCO", 5400.0);
		vetorCarro[6] = carro7;

		Carro carro8 = new Carro("SUPRA", "YUI-1121", 150, "GAZOLINA","BRANCO", 44600.0);
		vetorCarro[7] = carro8;

		Carro carro9 = new Carro("CAMARO", "VBN-3311", 450, "ALCOOL","PRETO", 28900.0);
		vetorCarro[8] = carro9;

		Carro carro10 = new Carro("PALIO", "TTR-3211", 150, "DIESEL","PRETO", 500.0);
		vetorCarro[9] = carro10;
		
		new Locadora();
	}

}
