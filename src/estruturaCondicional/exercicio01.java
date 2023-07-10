package estruturaCondicional;

import java.util.Scanner;

/*
 	
 	Fazer um programa para ler um número inteiro,
 	e depois dizer se este número é negativo ou não.

 */

public class exercicio01 {

	public static void main(String[] args) {
		
		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe numero para verificação: ");
		numero = sc.nextInt();
		
		if (numero < 0) {
			System.out.println("Numero negativo!");
		}
		else {
			System.out.println("Numero positivo!");
		}
		
		sc.close();

	}

}
