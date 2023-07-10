package estruturaRepetitivaFor;

import java.util.Scanner;

/*
 
 	Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir.
 	Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal.
 	Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que o
 	primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.

 */

public class ExFor03 {

	public static void main(String[] args) {

		int n;
		double media = 0;
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			
			
			a = a*2;
			b = b*3;
			c = c*5;
			media = (a + b + c)/ 10;
			
			System.out.printf("%.1f\n", media);
		}
		
			
		sc.close();
	}

}
