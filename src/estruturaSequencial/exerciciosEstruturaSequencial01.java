package estruturaSequencial;
import java.util.Scanner;

/*

 	Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma
 	desses números com uma mensagem explicativa, conforme exemplos.

 */

public class exerciciosEstruturaSequencial01 {

	public static void main(String[] args) {
		
		int x, y, soma;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		x = sc.nextInt();
		
		System.out.println("Informe um número: ");
		y = sc.nextInt();
		
		soma = x + y;
		
		System.out.println("Resultado da soma dos números: " + soma);
		
		sc.close();
	}

}
