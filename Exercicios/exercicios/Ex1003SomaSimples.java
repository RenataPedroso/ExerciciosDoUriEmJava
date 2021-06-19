package exercicios;
import java.util.Scanner;

/*
Inserir um valor inteiro, pressionar enter e inserir outro valor inteiro.
O programa realizará a soma dos valores digitados
 */


public class Ex1003SomaSimples {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
		int A, B, SOMA;
		A = sc.nextInt();
		B = sc.nextInt();
		
		SOMA = A + B;
		System.out.printf("SOMA = %d\n", SOMA);
		
		sc.close();
		
	}

}
