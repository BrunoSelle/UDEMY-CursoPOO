package estruturaRepetitivaWhile;

import java.util.Scanner;

/*
 
 	Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência
 	de seus clientes. Escreva um algoritmo para ler o tipo de combustível abastecido
	(codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim).
	Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado
	um novo código (até que seja válido). O programa será encerrado quando o código
	informado for o número 4. Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade
	de clientes que abasteceram cada tipo de combustível, conforme exemplo.

 */

public class Ex03 {

	public static void main(String[] args) {
		
		int x=0, gas=0, alc=0, die=0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Bem-vindo à pesquisa de preferência. Digite \n01 - Álcool\n02 - Gasolina\n03 - Diesel e\n04 - SAIR");
		
		while (x != 4) {
			x = sc.nextInt();
			if (x == 1) {
				alc++;
			} else if (x == 2) {
				gas++;
			} else if (x == 3) {
				die++;
			} else if (x == 4){
				
			} else {
				System.out.println("Opção Inválida, digite novamente...");
			}
						
		}
		
		System.out.println("MUITO OBRIGADO\nAlcool: " + alc + "\nGasolina: " + gas + "\nDiesel: " + die);
		
		sc.close();
	}

}
