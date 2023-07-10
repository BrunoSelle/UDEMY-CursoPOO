package estruturaRepetitivaFor;

import java.util.Scanner;

public class ExFor04 {

	public static void main(String[] args) {
	
		int n;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite N: ");
		n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			double a = sc.nextDouble();
			double b = sc.nextDouble();
						
			if (b == 0) {
				System.out.println("Divisão impossível");
			} else {
				double res = a / b;
				
				System.out.println(res);
			}
			
		}
		
		sc.close();
	}

}
