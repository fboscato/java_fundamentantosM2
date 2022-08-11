package exercicioAula28;

import java.text.NumberFormat;
import java.util.Locale;

public class Exercicio10 {
	public static void main(String[] args) {
		// Defina abaixo o Locale como US
		Locale.setDefault(new Locale("en-US"));

		NumberFormat formatoMoedaUS = NumberFormat.getCurrencyInstance();

		String str1 = "123456";
		int num1 = Integer.parseInt(str1);

		// Imprima num1 usando NumberFormat incluindo o símbolo monetário
		System.out.println(formatoMoedaUS.format(num1));

		// Defina abaixo o Locale como português do Brasil
		Locale.setDefault(new Locale("pt-BR"));

		NumberFormat formatoMoedaBR = NumberFormat.getCurrencyInstance();

		String str2 = "789.01";
		double num2 = Double.parseDouble(str2);

		// Imprima num2 usando NumberFormat incluindo o símbolo monetário
		System.out.println(formatoMoedaBR.format(num2));
	}

}
