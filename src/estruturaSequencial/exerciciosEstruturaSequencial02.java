package estruturaSequencial;
import java.util.Scanner;

/*
 
 	Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da
 	área deste círculo com quatro casas decimais conforme exemplos.
	Fórmula da área: area = π . raio2
	Considere o valor de π = 3.14159

 */


public class exerciciosEstruturaSequencial02 {

	public static void main(String[] args) {
		
		double π, raio, raioQ, area;
		
		Scanner sc = new Scanner(System.in);
		
		π = 3.14159;
		
		System.out.println("Digite o raio do circulo: ");
		
		raio = sc.nextDouble();
		
		raioQ = Math.pow(raio, 2.0);
		
		area = π * raioQ;
		
		System.out.printf("Resultado da área: %.4f\n", area);

		sc.close();
	}

}
