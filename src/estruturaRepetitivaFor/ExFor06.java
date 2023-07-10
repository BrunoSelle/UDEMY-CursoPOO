package estruturaRepetitivaFor;

import java.util.Scanner;

/*
 
 	Ler um número inteiro N e calcular todos os seus divisores.

 */

public class ExFor06 {

	public static void main(String[] args) {

		int n, res;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero para descobrir seus divisores:");
		n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			
			res = n % i;
			
			if (res == 0) {
				System.out.println(i);
			}
			
		}
		
		sc.close();
				
	}

}
