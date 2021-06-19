package exercicios;
import java.util.Locale;
import java.util.Scanner;

/*
 Inserir um valor com uma casa decimal, pressionar enter e inserir outro.
 O programa realizará a média dos valores, sendo que o primeiro valor inserido
 possui peso 3.5 e o segundo 7.5 e apresentará o resultado, com 5 casas decimais, dessa média.
 */

public class Ex1005Media1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in); 
		double A, B, MEDIA;
			
		A = sc.nextDouble();
		B = sc.nextDouble();
		MEDIA = ((A * 3.5) + (B * 7.5))/11;
			
		System.out.printf("MEDIA = %.5f\n", MEDIA);
			
		sc.close();
		
	}

}
