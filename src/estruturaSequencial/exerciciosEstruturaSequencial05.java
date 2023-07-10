package estruturaSequencial;
import java.util.Scanner;

/*

 	Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor
 	unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor
 	unitário de cada peça 2. Calcule e mostre o valor a ser pago.

 */

public class exerciciosEstruturaSequencial05 {

	public static void main(String[] args) {
		
		int cod1, cod2, qtd1, qtd2;
		double preco1, preco2, sub1, sub2, total;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o codigo da primeira peça: ");
		cod1 = sc.nextInt();
		
		System.out.println("Informe a quantidade de peças adquiridas: ");
		qtd1 = sc.nextInt();
		
		System.out.println("Informe o valor unitario da peça: ");
		preco1 = sc.nextDouble();
		
		System.out.println("Informe o codigo da segunda peça: ");
		cod2 = sc.nextInt();
		
		System.out.println("Informe a quantidade de peças adquiridas: ");
		qtd2 = sc.nextInt();
		
		System.out.println("Informe o valor unitario da peça: ");
		preco2 = sc.nextDouble();
		
		sub1 = (double) qtd1 * preco1;
		sub2 = (double) qtd2 * preco2;
		
		total = sub1 + sub2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
		
		sc.close();
	}

}
