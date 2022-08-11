package exercicioAula28;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double peso =0.0; 
		double altura=0.0;
		double imc = 0.0;
		
		
		System.out.println("Digite seu peso");
		peso = scan.nextDouble();
		System.out.println("Digite seu Altura");
		altura = scan.nextDouble();
		 imc = peso / (Math.pow(altura, 2));
		 if (imc <= 19){
				System.out.println("Magreza");
		 }else if (imc <= 25) {
				System.out.println("Normal");
		 }else if (imc <= 30) {
				System.out.println("SobrePeso");
		 }else if (imc <= 35) {
				System.out.println("Obesidade");
		 }else {
				System.out.println("Obesidade grave");
			}
	}

}
