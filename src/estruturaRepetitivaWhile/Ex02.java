package estruturaRepetitivaWhile;

import java.util.Scanner;

/*

 	Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de
 	pontos no sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence.
 	O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA
 	(nesta situação sem escrever mensagem alguma).

 */

public class Ex02 {

	public static void main(String[] args) {
		
		int x=1, y=1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe 'x' e 'y':");
				
		while (x != 0 && y != 0) {
			x = sc.nextInt();
			y = sc.nextInt();	
			
			if (x > 0 && y > 0){
				System.out.println("Primeiro");
			} else if (x < 0 && y > 0) {
				System.out.println("Segundo");
			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro");
			} else if (x > 0 && y < 0){
				System.out.println("Quarto");
			}
		}
		
		sc.close();
	}

}
