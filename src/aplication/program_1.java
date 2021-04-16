package aplication;

import java.util.Scanner;

public class program_1 {

	public static void main(String[] args) {
		
		/* DECLARAÇÃO DE VARIAVEL  */

		Scanner sc = new Scanner(System.in);
		double A, B;

		/* ENTRADA DE DADOS  */

		System.out.println("Enter with number: ");
		A = sc.nextDouble();
		B = sc.nextDouble();
		
		/* CONDICIONAMENTO DE VALORES PARA SABER QUAL É MAIOR */

		if (A >= B) {
			System.out.println("More number: " + A);
		} else {
			System.out.println("More number: " + B);
		}

		sc.close();
	}
}