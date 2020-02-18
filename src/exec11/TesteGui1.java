package exec11;
/**
 * Classe que mostra como criar uma tela
 * @author fcorrea
 * @since 18/02/2020
 */
import javax.swing.JButton;
import javax.swing.JFrame;

public class TesteGui1 {
	
	//Declaras as variaveis de referencia
	private static JFrame janela;
	private static JButton botao;

	public static void main(String[] args) {
	
		//criar uma nova tela
		janela = new JFrame("Minha primeira tela");
		
		//criar um novo botão
		botao = new JButton("Clique aqui!");
		
		//adicionar o botão ao painel da janela
		janela.getContentPane().add(botao);  //capitura o espaço da tela
		
		//configurar o tamanho da tela
		janela.setSize(300, 300); //referencias de tamanho
		
		//configurar a visibilidade da tela (true/false)
		janela.setVisible(true);
		
		//informar que a tela não tem layout pré-definido
		janela.getContentPane().setLayout(null);
		
		
		
	}

}
