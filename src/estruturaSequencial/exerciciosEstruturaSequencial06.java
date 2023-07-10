package estruturaSequencial;
import java.util.Scanner;

/*
 
 	Fazer um programa que leia três valores com ponto flutuante de dupla precisão:
 	A, B e C. Em seguida, calcule e mostre:
	a) a área do triângulo retângulo que tem A por base e C por altura.
	b) a área do círculo de raio C. (pi = 3.14159)
	c) a área do trapézio que tem A e B por bases e C por altura.
	d) a área do quadrado que tem lado B.
	e) a área do retângulo que tem lados A e B.

 */

public class exerciciosEstruturaSequencial06 {

	public static void main(String[] args) {
	
		double a, b, c, π = 3.14159, raioQ, triangulo, circulo, trapezio, quadrado, retangulo;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe três valores: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
//A
		triangulo = (a*c)/2;
//B
		raioQ = Math.pow(c, 2.0);
		circulo = π*raioQ;
//C
		trapezio = ((a+b)*c)/2;
//D
		quadrado = b*b;
//E
		retangulo = a*b;
		
		System.out.printf("TRIANGULO: %.2f\nCIRCULO: %.2f\nTRAPÉZIO: %.2f\nQUADRADO: %.2f\nRETANGULO: %.2f\n", triangulo, circulo, trapezio, quadrado, retangulo);
		
		sc.close();

	}

}
