package estruturaSequencial;
import java.util.Scanner;

public class exerciciosEstruturaSequencial03 {

	public static void main(String[] args) {
		
		int a, b, c, d, dif;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro numero: ");
		a = sc.nextInt();
		
		System.out.println("Informe o segundo numero: ");
		b = sc.nextInt();
		
		System.out.println("Informe o terceiro numero: ");
		c = sc.nextInt();
		
		System.out.println("Informe o quarto numero: ");
		d = sc.nextInt();
		
		dif = a*b - c*d;
		
		System.out.println("Resultado: " + dif);
		
		sc.close();
	}

}
