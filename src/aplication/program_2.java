package aplication;

import java.util.Scanner;

public class program_2 {

	public static void main(String[] args) {
		
		/* DECLARAÇÃO DE VARIAVEL */
		
		Scanner sc = new Scanner(System.in);
		int A, B, N;

		/* ENTRADA DE DADOS */

		System.out.print("Enter with first number: ");
		A = sc.nextInt();
		System.out.print("Enter with Second number: ");
		B = sc.nextInt();

		/* LOGICA DE ADIÇÃO ENTRE DOIS INTEIROS */

		N = A - B;
		System.out.println("Result: " + N);

		/* CONDICIONAMENTO DE VALOROES PARA SABER ONDE  SOMAR 7 OU 5 */

		if (N >= 10) {
			N = A - B + 5;
			System.out.println("Upgrand + 5: " + N);

		} else {
			N = A - B + 7;
			System.out.println("Upgrand + 7: " + N);
		}

		sc.close();
	}
}