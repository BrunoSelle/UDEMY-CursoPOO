package estruturaCondicional;

import java.util.Scanner;

/*
 
 	Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar
 	seus impostos, pois sabem que nele não existem políticos corruptos e os recursos
 	arrecadados são utilizados em benefício da população, sem qualquer desvio. A moeda
 	deste país é o Rombus, cujo símbolo é o R$.
	Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb.
	Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda,
	segundo a tabela abaixo.
	Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre
	R$ 1000.00, pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de
	Imposto de Renda. No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18%
	sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com duas
	casas decimais.

 */


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
