package estruturaRepetitivaFor;

import java.util.Scanner;

/*

	Fazer um programa para ler um número inteiro positivo N. O programa deve então
	mostrar na tela N linhas, começando de 1 até N. Para cada linha, mostrar o número
	da linha, depois o quadrado e o cubo do valor, conforme exemplo. 

 */

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
