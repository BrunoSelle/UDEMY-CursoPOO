package estruturaRepetitivaFor;

import java.util.Scanner;

public class ExFor07 {

	public static void main(String[] args) {
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			
			int j = i*i;
			int k = i*i*i;
			System.out.println(i + " " + j + " " + k);
			
		}
				
		sc.close();

	}

}
