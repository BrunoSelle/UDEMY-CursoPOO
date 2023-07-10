package estruturaRepetititaDoWhile;

import java.util.Scanner;

/*

 	Programa para converter de Celsius para Fahenreit pelo menos uma vez.

 */

public class programaFahenheitCelsius {

	public static void main(String[] args) {
		
		double c, f;
		char r;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em ºC para converter para ºF:");
		
		do {
		
		c = sc.nextDouble();
		
		f = (c * 9 / 5) + 32;
		
		System.out.println("O equivalente a " + c + "ºC é " + f + "ºF");
		System.out.println("Deseja informar um novo valor (S/N)?");
		r = sc.next().charAt(0);
		} while (r != 'n');
		
		sc.close();

	}

}
