package estruturaCondicional;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		
		double salary, tax1, tax2, tax3, totaltax;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu salário: ");
		salary = sc.nextDouble();
		
		if (salary <= 2000) {
			
			System.out.println("Isento");
			
		} else if (salary > 2000 && salary <= 3000) {
			
			salary = salary - 2000;
			totaltax = salary * 0.08;
			System.out.printf("Imposto a pagar! R$ %.2f/n", totaltax);
			
		} else if (salary > 3000 && salary <= 4500) {
		
			salary = salary - 2000;
			if (salary > 1000) {
				
				tax1 = 1000 * 0.08;
				salary = salary - 1000;
				tax2 = salary * 0.18;
				totaltax = tax1 + tax2;
				
			} else 
			totaltax = salary * 0.08;
			System.out.printf("Imposto a pagar! R$ %.2f%n", totaltax);
		
		} else {
			
			salary = salary - 2000;
			tax1 = 1000 * 0.08;
			salary = salary - 1000;
			tax2 = 1500 * 0.18;
			salary = salary - 1500;
			tax3 = salary * 0.28;
			totaltax = tax1 + tax2 + tax3;
			
			System.out.printf("Imposto a pagar! R$ %.2f%n", totaltax);
			
		}
		
		sc.close();

	}

}
