package exercicios;
import java.util.Locale;
import java.util.Scanner;

/*
 Inserir tr�s valores com uma casa decimal.
 O programa retornar� a m�dia desses tr�s valores, com uma casa decimal apenas.
 */

public class Ex1005Media2 {

	public static void main(String[] args) {

        Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in); 
		double A, B, C, MEDIA;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		MEDIA = ((A * 2) + (B * 3) + (C * 5))/10.0;
		
		System.out.printf("MEDIA = %.1f\n", MEDIA);
		
		sc.close();

		
	}

}
