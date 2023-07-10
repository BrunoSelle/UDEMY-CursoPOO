package estruturaCondicional;

import java.util.Scanner;

/*

	Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo,
	sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração
	mínima de 1 hora e máxima de 24 horas.

 */

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
				
		System.out.println("O JOGO DUROU " + dur + " HORA(S)");
		
		sc.close();
				
	}

}
