package estruturaCondicional;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {

		int ini, fim, dur;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a hora de inicio: ");
		ini = sc.nextInt();
		
		System.out.println("Informe a hora de final: ");
		fim = sc.nextInt();
		
		if (ini < fim) {
			
			dur = fim - ini;
			
		}
		else {
			
			dur = (24 - ini) + fim;
		}
				
		System.out.println("O JOGO DUROU " + dur + " HORAS");
		
		sc.close();
				
	}

}
