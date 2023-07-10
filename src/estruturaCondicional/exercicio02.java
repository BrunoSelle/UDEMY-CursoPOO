package estruturaCondicional;

import java.util.Scanner;

/*
	Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
 */

public class exercicio02 {

	public static void main(String[] args) {
		
	int numero, resto;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Informe um numero");
	numero = sc.nextInt();
	
	resto = numero % 2;
	
	if (resto == 0) {
		
		System.out.println(numero + " É PAR");
		
	} else {
		
		System.out.println(numero + " É IMPAR");
		
	}
	
	sc.close();
	}

}
