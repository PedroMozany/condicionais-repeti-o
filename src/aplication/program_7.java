package aplication;

import java.util.Scanner;

public class program_7 {

	public static void main(String[] args) {

		/* DECLARA플O DAS VARIEVEIS */
		Scanner sc = new Scanner(System.in);
		int n, positivo = 0, negativo = 0, zero = 0, total = 0;
		double porc1 = 0, porc2 = 0, porc3 = 0;

		/*
		 * ESTRUTURA DE REPETI플O PARA CHEGAR NO RESULTADO SOLICITADO, ONDE "8" SERA A
		 * CONDI플O QUE DETERMINAR� O FIM DA REPETI플O
		 */
		for (int i = 0; i <= 8; i++) {

			System.out.println("Digite a seq獪ncia de valores inteiros:  ");
			n = sc.nextInt();
			total++;

			/* EXTRUTURA PARA SABER ONDE CADA NUMERO DIGITO VAI SER ENCAIXA */
			if (n < 0) {
				negativo = negativo + 1;

			} else if (n == 0) {
				zero = zero + 1;

			} else {
				positivo = positivo + 1;

			}

			/*
			 * CALCULO PARA SABER CALCULO DE PERCENTUAL DOS VLORES NEGATIVOS, POSITIVOS E
			 * ZERO
			 */
			porc1 = ((double) negativo / total) * 100;
			porc2 = ((double) zero / total) * 100;
			porc3 = ((double) positivo / total) * 100;

			/* SAIDA DOS RESULTADOS */
			System.out.printf("Positivo: %.1f%%\n", porc3);
			System.out.printf("Negativo:  %.1f%%\n", porc1);
			System.out.printf("Zero: %.1f%%\n", porc2);
			System.out.println("Total: " + total);
		}

		sc.close();
	}
}