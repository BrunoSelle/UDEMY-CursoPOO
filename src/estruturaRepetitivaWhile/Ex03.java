package estruturaRepetitivaWhile;

import java.util.Scanner;

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
