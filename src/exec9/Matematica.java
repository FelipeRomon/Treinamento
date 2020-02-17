package exec9;

public class Matematica {

	public static void main(String[] args) {
		
		double x = 10, y = 20.5 , z = -30;
		
		//Mostrar o valor absoluto
		double abs = Math.abs(z);
		
		System.out.println(abs);
		
		//Retorna arredondado para menor valor inteiro
		double ceil = Math.ceil(y);
		
		System.out.println(ceil);
		
		
		//Retorna arredondado para maior valor inteiro
		double floor = Math.floor(y);
		
		System.out.println(floor);
		
		//logaritimo
		double log = Math.log(x);
		
		System.out.println(log);
		
		//REtorna Maior valor inteiro entre os dois elementos
		double max = Math.max(x, y);
		System.out.println(max);
		
		//Retorna Menor valor inteiro entre os dois
		double mim = Math.min(x, y);
		System.out.println(mim);
		
		//Calcular a potencia
		double pow = Math.pow(x, 2);
		System.out.println(pow);
		
		//Calcula a raiz quadrada
		double sqrt = Math.sqrt(x);
		System.out.println(sqrt);
		
		//Calcula cosceno
		double cos = Math.acos(y);
		System.out.println(cos);
		
		//Calcula seno
		double sin = Math.sin(y);
		System.out.println(sin);
		
		//Calcula tangente
		double tan = Math.tan(y);
		System.out.println(tan);

	}

}
