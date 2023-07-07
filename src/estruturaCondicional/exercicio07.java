package estruturaCondicional;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		
		double x, y;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe x e y: ");
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		if (x == 0 && y == 0) {
			
			System.out.println("Origem");
			
		} else if (x > 0 && y > 0) {
			
			System.out.println("Q1");
			
		} else if (x < 0 && y > 0) {
		
			System.out.println("Q2");
		
		} else if (x < 0 && y < 0) {
		
			System.out.println("Q3");
		
		} else if (x > 0 && y < 0) {
	
			System.out.println("Q4");
			
		} else {
			
			System.out.println("Algum dos pontos está sobre o eixo.");
			
		}
		
		sc.close();
	
	}

}
