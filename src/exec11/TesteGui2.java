package exec11;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TesteGui2 {

	public static void main(String[] args) {
		
		//Definir a tela e suas caracteristicas
		JFrame janela =new JFrame();
		
		//colocar o titulo da tela
		janela.setTitle("Titulo da minha janela");
		
		//definir tamanho da tela
		janela.setSize(300, 200);
		
		janela.getContentPane().setLayout(null);
		
		//
		janela.setLocationRelativeTo(null);
		
		//definir o componente JButton
		JButton botao = new JButton();
		
		//colocando um texto no botão
		botao.setText("Clique aqui");
		
		//formatar o botão
		botao.setBounds(140, 120, 100, 20); // x e y é plano cartesiano na tela / 100 e 20 são largura e altura respectivamente
		
		//Definir o componente JLabel de rotulo
		JLabel lblNome = new JLabel();
		lblNome.setText("Nome: "); //colocando o testo no JLabel
		lblNome.setBounds(10, 40, 40, 20);
		
		//Definir o campo de texto JTextField
		JTextField txtNome = new JTextField();
		txtNome.setBounds(50, 40, 100, 20);
		
		//Adicionar os componentes na tela
		janela.getContentPane().add(botao);
		janela.getContentPane().add(lblNome);
		janela.getContentPane().add(txtNome);
		
		//informar a visibilidade da tela
		janela.setVisible(true);
		
	}

}
