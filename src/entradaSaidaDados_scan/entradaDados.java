package entradaSaidaDados_scan;
import java.util.Scanner;

public class entradaDados {

	public static void main(String[] args) {
	
/*
	Para a entrada de dados sempre é necessário instanciar um objeto do tipo Scanner e importar a classe do java.util
*/		
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		System.out.println("Você digitou: " + x);
		
/* 
	Para entrada inteiro, usar 'sc.nextInt()'
	Para entrada double, usar 'sc.nextDouble'
	Para entrada char, usar 'sc.next().charAt(0)'
	Para o programa ler todos os dados informados até dar enter	usar: 'sc.nextLine();'.
	Se o nextLine for usado em conjunto com qualquer sc, ele deve ser duplo:
*/		
		
		String s1;
		int y;
		y = sc.nextInt();		
//nextLine duplo		
		sc.nextLine();
		s1 = sc.nextLine();
		
		System.out.println("Você digitou: " + s1);
		System.out.println("Você digitou: " + y);
		
/*
 	Ao final do programa, sempre se encerra o scanner criado com o seguinte comando:
*/
		
		sc.close();
	}

}
