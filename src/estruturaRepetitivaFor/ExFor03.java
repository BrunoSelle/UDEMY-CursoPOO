package estruturaRepetitivaFor;

import java.util.Scanner;

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
