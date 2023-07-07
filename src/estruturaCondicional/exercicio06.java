package estruturaCondicional;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		
		double valor;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um valor entre 0 e 100: ");
		valor = sc.nextDouble();
		
		if (valor >= 0 && valor <= 25) {
			
			System.out.println("Intervalo 0~25");
		
		} else if (valor > 25 && valor <= 50) {
			
			System.out.println("Intervalo 25~50");
		
		} else if (valor > 50 && valor <= 75) {
			
			System.out.println("Intervalo 50~75");
		
		} else if (valor > 75 && valor <= 100) {
			
			System.out.println("Intervalo 75~100");
		} else {
			
			System.out.println("Numero informado esta fora do intervalo solicitado.");
		}
		
		sc.close();
	}

}
