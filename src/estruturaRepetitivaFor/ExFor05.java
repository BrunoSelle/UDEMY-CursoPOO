package estruturaRepetitivaFor;

import java.util.Scanner;

/*

 	Ler um valor N. Calcular e escrever seu respectivo fatorial.
 	Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
	Lembrando que, por definição, fatorial de 0 é 1.
 
 */

public class ExFor05 {

	public static void main(String[] args) {

		int n, res;

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um numero para calcular o fatorial:");
		n = sc.nextInt();

		if (n == 0) {

			res = 1;
			
		} else {
			
			res = n;
			for (int i = 1; i < n; i++) {

				res = res * i;

			}
		}

		System.out.println(res);

		sc.close();
	}

}
