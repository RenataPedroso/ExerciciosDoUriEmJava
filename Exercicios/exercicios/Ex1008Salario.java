package exercicios;
import java.util.Locale;
import java.util.Scanner;

/*
O programa calculará o salário de um funcionário de acordo com o valor e horas trabalhadas.
Inserir número do funcionário e a quantidade de horas trabalhadas com um valor inteiro.
Inserir o valor por hora trabalhada, que pode possuir casa decimal.
*/

public class Ex1008Salario {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in); 
		int numero, hora;
		double sal, salario; 
		
		numero = sc.nextInt();
		hora = sc.nextInt();
		sal = sc.nextDouble(); 
		salario  =  hora * sal;
		
		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();
		
	}

}
