package estruturaRepetitivaFor;

import java.util.Scanner;

/*
 
 	Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X,
 	um valor por linha, inclusive o X, se for o caso.

 */

public class ExFor01 {

	public static void main(String[] args) {
	
		int x;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número limite:");
		x =  sc.nextInt();
		
		for (int i=0;i<=x;i++) {
			if (i%2 != 0) {
			System.out.println(i);
		}
		sc.close();
	}

	}
}