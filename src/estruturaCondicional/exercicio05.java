package estruturaCondicional;

import java.util.Scanner;

/*

	Com base na tabela, escreva um programa que leia o código de um item e a quantidade
	deste item. A seguir, calcule e mostre o valor da conta a pagar.

*/

public class exercicio05 {

	public static void main(String[] args) {
		
		int cod, qtd;
		double preco = 0, total;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o codigo do item: ");
		cod = sc.nextInt();
		
		if (cod < 1 || cod > 5) {
			
			System.out.println("Opção inválida, refaça o pedido.");
			System.exit(0);
			
		}
		
		if (cod == 1) {
			preco = 4.00;
		}
		if (cod == 2) {
			preco = 4.50;
		}
		if (cod == 3) {
			preco = 5.00;
		}
		if (cod == 4) {
			preco = 2.00;
		}
		if (cod == 5) {
			preco = 1.50;
		}
		
		System.out.println("Informe a quantidade desejada: ");
		qtd = sc.nextInt();
		
		total = (double) preco * qtd;
		
		System.out.printf("Total: R$ %.2f\n", total);
		
		sc.close();

	}

}
