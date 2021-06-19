package exercicios;
import java.util.Locale;
import java.util.Scanner;

/*
Este programa realizar� o c�culo do valor total que voc� deve pagar por uma determinada quantidade de dois produtos(pe�as).
Inserir o c�digo da primeira pe�a, a quantidade de pe�as, e o valor unit�rio de cada uma delas.
Realizar o mesmo para a segunda pe�a.
*/

public class Ex1010CalculoSimples {

	public static void main(String[] args) {

        Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int qtd1, qtd2, cod1, cod2;
		double valor1, valor2, valorFinal;
		cod1 = scan.nextInt();
    	qtd1 = scan.nextInt();
		valor1 = scan.nextDouble();
		cod2 = scan.nextInt();
		qtd2 = scan.nextInt();
		valor2 = scan.nextDouble();
		valorFinal = (qtd1 * valor1) + (qtd2 * valor2);
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorFinal);

		scan.close();
	}

}
