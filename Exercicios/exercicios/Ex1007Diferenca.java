package exercicios;
import java.util.Scanner;

/*
 Inserir 4 valores inteiros.
 O programa calculará a diferença do produto de A e B pelo produto de C e D.
 */

public class Ex1007Diferenca {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 
		int A, B, C, D, DIFERENCA;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		DIFERENCA = (A * B - C * D);
		
		System.out.println("DIFERENCA = " + DIFERENCA);
		
		sc.close();
		
	}

}
