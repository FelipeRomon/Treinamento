package exec11;
/**
 * @author fcorrea
 * @sice 18/02/2020
 * @version 0.1
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TesteGui3 {

	//Declarar os componentes da tela
	
	private JFrame janela;
	private JButton botao1;
	private JButton botao2;
	private JTextField campo; //campo area para digitar
	private JTextArea area; // onde voce vai mostrar as informações
	
	
	public TesteGui3() {
		iniciaGui();
	}
	
	
	public void iniciaGui() {
		
		//Criar a janela (instancia)
		janela = new JFrame();
		
		//Criar uma nova areia de texto
		area = new JTextArea();
		
		//Criar o primeiro botão
		botao1 = new JButton("Clique aqui");
		//Adicionar o metodo desenvolvido na classe TextoListener
		botao1.addActionListener(new TextoListener()); //instancia uma classe interna que traz um método
		
		//Criar o segundo botão com evento
		botao2 = new JButton("Trocar cor");
		//Adicionar o metodo desenvolvido na classe Cor
		botao2.addActionListener(new CorListener());
		
		//Criar um campo para digitar texto
		campo = new JTextField();
		
		//Adicionar o metodo desenvolvido na classe TextoListener
		campo.addActionListener(new TextoListener()); //Para colocar a mesma ação do botão no campo
		
		//Adicionar o botão ao painel da janela
		janela.getContentPane().add(BorderLayout.EAST,botao2); //para colocar ele numa regão padrão east
		
		//Adicionar o botão ao painel da janela
		janela.getContentPane().add(BorderLayout.SOUTH,botao1); //para colocar ele numa regão padrão South
		
		//Adicionar a area ao painel da janela
		janela.getContentPane().add(BorderLayout.CENTER,area); //para colocar a area padrão centro
		
		//Adicionar JTextField ao painel da janela
		janela.getContentPane().add(BorderLayout.NORTH,campo);
		
		//Configurar o tamanho da janela
		janela.setSize(300, 300);
		
		//Configurar para mostrar a tela
		janela.setVisible(true);
		
	}
	
	//Classe dentro de outra que aguarda uma acão da 
	public class TextoListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			//Concatenando a area com o campo
			area.append(campo.getText() + "\n");
			campo.setText("");
			
		}
		
	}
	
	
	//classe para modificar a cor
	public class CorListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			//Se o fundo da JTextArea for neutro troca para preto
			if(area.getBackground().equals(Color.BLACK)){
				
				//trocar a cor para branco
				area.setBackground(Color.WHITE);
				//trocar a cor da informação do Background
				area.setForeground(Color.BLACK);
				
			}else {
				
				//trocar a cor para preto
				area.setBackground(Color.BLACK);
				//trocar a cor da informação do Background
				area.setForeground(Color.WHITE);

			}
		}
	}
	
	
	
	
	public static void main(String[] args) {
		new TesteGui3();
		

	}

}
