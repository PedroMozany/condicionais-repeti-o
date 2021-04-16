package aplication;

import java.util.Scanner;

public class program_6 {

	public static void main(String[] args) {
		/* DECLARA플O DAS VARIEVEIS */
		Scanner sc = new Scanner(System.in);
		int n, negativo = 0, positivo = 0, zero = 0;
		/*
		 * ESTRUTURA DE REPETI플O PARA CHEGAR NO RESULTADO SOLICITADO, ONDE "8" SERA A
		 * CONDI플O QUE DETERMINAR� O FIM DA REPETI플O
		 */
		for (int i = 0; i <= 8; i++) {

			System.out.println("Digite a seq獪ncia de valores inteiros:  ");
			n = sc.nextInt();

			if (n < 0) {
				negativo = negativo + 1;

			} else if (n == 0) {
				zero = zero + 1;

			} else {
				positivo = positivo + 1;
			}
			/* SAIDA DOS RESULTADOS */
			System.out.println("Positivo: " + positivo);
			System.out.println("Negativo: " + negativo);
			System.out.println("Zero: " + zero);
		}

		sc.close();
	}
}