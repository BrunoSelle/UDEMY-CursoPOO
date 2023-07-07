package estruturaSequencial;
import java.util.Scanner;

public class exerciciosEstruturaSequencial04 {

	public static void main(String[] args) {
		
		int matr, ht;
		double vh, rem;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o número de matrícula do funcionário: ");
		matr = sc.nextInt();
		
		System.out.println("Informe o número de horas trabalhadas: ");
		ht = sc.nextInt();
		
		System.out.println("Informe o valor/hora que o funcionário recebe: ");
		vh = sc.nextDouble();
		
		rem = (double) ht * vh;
		
		System.out.printf("O funcionário de matrícula '" + matr + "' receberá:\n\n" 
							+ "R$ %.2f reias.\n\n"
							+ "Numero de horas trabalhadas: " + ht
							+ "\nValor/Hora recebido: " + vh, rem);
		
		sc.close();

	}

}
