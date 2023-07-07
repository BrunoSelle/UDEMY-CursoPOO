package estruturaCondicional;

import java.util.Scanner;

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
