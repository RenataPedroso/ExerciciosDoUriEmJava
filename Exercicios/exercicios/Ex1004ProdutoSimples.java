package exercicios;
import java.util.Scanner;

/* 
 Inserir um n�mero inteiro, pressionar enter, inserir outro n�mero inteiro.
 O programa realizar� a multiplica��o os valores inseridos e mostrar� o produto.
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
