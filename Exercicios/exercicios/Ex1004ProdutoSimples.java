package exercicios;
import java.util.Scanner;

/* 
 Inserir um número inteiro, pressionar enter, inserir outro número inteiro.
 O programa realizará a multiplicação os valores inseridos e mostrará o produto.
 */

public class Ex1004ProdutoSimples {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
		int A, B, PROD;
		A = sc.nextInt();
		B = sc.nextInt();
		
		PROD = A * B;
		System.out.printf("PROD = %d\n", PROD);
		
		sc.close();
		
	}

}
