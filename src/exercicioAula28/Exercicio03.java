package exercicioAula28;

public class Exercicio03 {
	public static void main(String[] args) {
		
	//Potencia
		double potencia = Math.pow(4, 10);
		System.out.println("Potencia) " + potencia);
	//Rais Quadrada
		double raizQuadrada = Math.sqrt(50);
		System.out.println("Rais Quadrada) " + raizQuadrada);
	//Valor Absoluto
		int valorAbsoluto = Math.abs(-30);
		System.out.println("Valor Absoluto) " + valorAbsoluto);
	//Valor Maximo
		int valorMaximo = Math.max(42, 666);
		System.out.println("Valor Maximo) " + valorMaximo);
	//Valor Minimo
		int valorMinimo = Math.min(42, 666);
		System.out.println("Valor Minimo) " + valorMinimo);
	// arredondarPraCima
		double arredondarPraCima = Math.ceil(4.9);
		System.out.println("6) " + arredondarPraCima);
	//arredondarPraBaixo
		double arredondarPraBaixo = Math.floor(4.9);
		System.out.println("7) " + arredondarPraBaixo);
	//seno
		double seno = Math.round(Math.sin(Math.toRadians(90)));
		System.out.println("8.1) " + seno);
	//Cosseno
		double cosseno = Math.round(Math.cos(Math.toRadians(90)));
		System.out.println("8.2) " + cosseno);
	//Tangente
		double tangente = Math.round(Math.tan(Math.toRadians(45)));
		System.out.println("8.3) " + tangente);
	}

}
