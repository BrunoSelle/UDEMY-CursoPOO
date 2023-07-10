package estruturaRepetitivaFor;

import java.util.Scanner;


/*

	Fazer um programa para ler um número N. Depois leia N pares de números e mostre a
	divisão do primeiro pelo 	segundo. Se o denominador for igual a zero, mostrar a
	mensagem "divisao impossivel". 

 */
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
