package estruturaRepetitivaFor;

import java.util.Scanner;

public class ExFor02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, x, in=0, out=0;
		
		System.out.println("Digite a quantidade de numeros: ");
		n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			x = sc.nextInt();
			if (x>=10 && x<=20) {
				in++;
			} else {
				out++;
			}
		}
		
		System.out.println(in + " in\n" + out + " out");
		
		sc.close();
	}

}
