package estruturaCondicional;

import java.util.Scanner;

/*

	Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
	"Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos
	entre si. Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.
 
 */

public class exercicio03 {

	public static void main(String[] args) {
		
		int a, b, c, resto;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois numeros");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (b>a) {
			
			c = b;
			b = a;
			a = c;
		}
		
		resto = a%b;
				
		if (resto == 0) {
						
			System.out.println(a + " e " + b + " são multiplos");
			
		}
		else {
			
			System.out.println(a + " e " + b + " NÃO são multiplos");
			
		}
		
		sc.close();

	}

}
