package exec4;
/**
 * Classe para testar Valores
 * @author fcorrea
 * @since 11/02/2020
 * @version 0.1
 */
public class TestaValor {

	public static void main(String[] args) {
//		byte b = (byte) 128;
		
//		System.out.println("O valor de b: " + b);
		
		double d = 100;
//		int i = (int) d;
		
		String p = "100";
		int i = Integer.parseInt(p);
		String s = i + "";
		
		System.out.println(s);
	}

}
