package estruturaRepetitivaWhile;

import java.util.Scanner;

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
