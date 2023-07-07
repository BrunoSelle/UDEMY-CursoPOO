package estruturaRepetitivaWhile;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		int senha;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a senha:");
		
		senha = sc.nextInt();
				
		while (senha != 2002) {
			System.out.println("Senha invalida");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
				
		sc.close();

	}

}
