package aplication;

import java.util.Scanner;

public class program_6 {

	public static void main(String[] args) {
		/* DECLARA��O DAS VARIEVEIS */
		Scanner sc = new Scanner(System.in);
		int n, negativo = 0, positivo = 0, zero = 0;
		/*
		 * ESTRUTURA DE REPETI��O PARA CHEGAR NO RESULTADO SOLICITADO, ONDE "8" SERA A
		 * CONDI��O QUE DETERMINAR� O FIM DA REPETI��O
		 */
		for (int i = 0; i <= 8; i++) {

			System.out.println("Digite a seq��ncia de valores inteiros:  ");
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