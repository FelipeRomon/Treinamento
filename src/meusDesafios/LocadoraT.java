package meusDesafios;

//import javax.swing.JOptionPane;
//
//import exec7.Carro;
//
///**
// * 
// * @author fcorrea
// *
// */
//
//public class Locadora extends Carro{
//	
//	static Carro vetorCarro[];
//	
//	public void busca(){
//		
//		String p = JOptionPane.showInputDialog("Como deseja realizar a busca: \n 1 - Modelo \n 2 - Velocidade \n 3 - Combustivel");
//		
//		switch (p){
//				case "1":	
//						String modelo = JOptionPane.showInputDialog("Digite o modelo do veiculo: ");
//						for (int i = 0; i <vetorCarro.length ; i++) {
//							
//							if(vetorCarro[i].modeloCarro.equals(modelo.toUpperCase())){
//									JOptionPane.showMessageDialog(null, vetorCarro[i]);
//			
//							}	
//						}
//									//JOptionPane.showMessageDialog(null, vetorCarro[i]);
//						break;
//				
//				case "2":
//					String v = JOptionPane.showInputDialog("Digite a velocidade: ");
//					int velocidade = Integer.parseInt(v);
//					for (int i = 0; i <vetorCarro.length ; i++) {
//						
//						if(vetorCarro[i].velocidadeMaxima == velocidade ){
//							JOptionPane.showMessageDialog(null, vetorCarro[i]);
//						}	
//					}	
//					break;
//					
//				case "3":
//					String con = JOptionPane.showInputDialog("Digite o tipo de combustivel: ");
//					
//					for (int i = 0; i <vetorCarro.length ; i++) {
//						
//						if(vetorCarro[i].modeloCarro.equals(con.toUpperCase())){
//								JOptionPane.showMessageDialog(null, vetorCarro[i]);
//		
//						}	
//					}
//					break;
//					
//				default:
//					JOptionPane.showMessageDialog(null, "Código invalido", "X" , JOptionPane.INFORMATION_MESSAGE);
//					}
//		}
////	public void buscaVelocidade(){
////		
////		String p = JOptionPane.showInputDialog("Informe  ");
////		int pla = Integer.parseInt(p);
////		
////		for (int i = 0; i <vetorCarro.length ; i++) {
////			
////			int plaCarro = Integer.parseInt((vetorCarro[i].combustivel).toUpperCase());
////			
////			if(plaCarro == pla){
////				JOptionPane.showMessageDialog(null, "Modelo encontrado!");
////			}else{
////				JOptionPane.showMessageDialog(null, "Modelo não encontrado!");
////		}	
////	}	
////}
//	
//	
//	
//	
//		
//	public static void main(String[] args) {
//	
//		
//		
//		vetorCarro = new Carro[10];
//		
//		Carro carro1 = new Carro("Gol", "bbe-3211", 150, "diesel", 24000.0);
//		vetorCarro[0]= carro1;
//		
//		Carro carro2 = new Carro("Civic", "fds-3241", 189, "alcool", 240.0);
//		vetorCarro[1]= carro2;
//		
//		Carro carro3 = new Carro("Pegioto206", "bbe-2211", 200, "gazolina", 500.0);
//		vetorCarro[2]= carro3;
//		
//		Carro carro4 = new Carro("Picape", "qqe-3211", 210, "alcool", 700.0);
//		vetorCarro[3]= carro4;
//		
//		Carro carro5 = new Carro("Fusca", "mng-3211", 140, "alcool", 600.0);
//		vetorCarro[4]= carro5;
//		
//		Carro carro6 = new Carro("Rx7", "bbe-3411", 180, "gazolina", 300.0);
//		vetorCarro[5]= carro6;
//		
//		Carro carro7 = new Carro("HB20", "bfe-3211", 200, "alcool", 400.0);
//		vetorCarro[6]= carro7;
//		
//		Carro carro8 = new Carro("Supra", "dae-1121", 150, "gazolina", 600.0);
//		vetorCarro[7]= carro8;
//		
//		Carro carro9 = new Carro("Camaro", "ooe-3311", 450, "alcool", 900.0);
//		vetorCarro[8]= carro9;
//		
//		Carro carro10 = new Carro("Pálio", "bbe-3211", 150, "diesel", 500.0);
//		vetorCarro[9]= carro10;
//	}

//}

