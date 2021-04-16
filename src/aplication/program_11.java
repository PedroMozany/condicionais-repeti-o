package aplication;

import java.util.Scanner;

public class program_11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		/*
		 * TECLARAÇÕES DAS VARIEAVEIS ONDE "N" É A UNICA QUE INICIA COM "1" PARA PODER
		 * REPETIR O COMANDO ATE O MOMENTO QUE DIGITAR "0" PARA FINALIZAR O PROGRAMA.
		 */
		int cand1 = 0, cand2 = 0, cand3 = 0, cand4 = 0, nulo = 0, branco = 0, N = 1;
		/*
		 * ESTRUTURA DE REPETIÇÃO ONDE A CODINÇÃO PARA O PROGRAMAR FINALIZAR O CONJUNTO
		 * DE VOTOS É "N" DIFERTENTE DE "0"
		 */
		while (N != 0) {

			System.out.print("Digite o código do candidado: ");
			N = sc.nextInt();

			/*
			 * ESTRUTURA DE CONDICIONAMENTO JA COM CADA VARIAVEL ESTABELECIDA COM SEU CODIGO
			 */

			if (N == 1) {
				cand1++;
			} else if (N == 2) {
				cand2++;

			} else if (N == 3) {
				cand3++;

			} else if (N == 4) {
				cand4++;

			} else if (N == 5) {
				nulo++;

			} else if (N == 6) {
				branco++;

			}

			// SAÍDA...
			System.out.println("Candidato_1: " + cand1);
			System.out.println("Candidato_2: " + cand2);
			System.out.println("Candidato_3: " + cand3);
			System.out.println("Candidato_4: " + cand4);
			System.out.println("Total de votos nulos: " + nulo);
			System.out.println("Total de votos em branco: " + branco);

		}

		sc.close();

	}
}
