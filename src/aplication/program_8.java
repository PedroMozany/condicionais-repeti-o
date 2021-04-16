package aplication;

import java.util.Scanner;

public class program_8 {

	public static void main(String[] args) {
		/*
		 * DECLARAÇÃO DE VARIAVEL, "E" é "J" VÃO INICIAR COM 1. "n" SERA O NOSSO NUMERO INTEIRO
		 * E POSITICO
		 */

		Scanner sc = new Scanner(System.in);
		int n;
		double E = 1, J = 1;

		/* ENTRADA DO VALOR DE INTEIRO "n" */
		System.out.print("Enter with number: ");
		n = sc.nextInt();

		/*
		 * ESTRUTURA DE REPETIÇÃO PARA CHEGAR NO RESULTADO SOLICITADO, ONDE "N" SERA A
		 * CONDIÇÃO QUE DETERMINARÁ O FIM DA REPETIÇÃO
		 */
		for (int i = 1; i <= n; i++) {
			/*
			 * LOGICA DE CALCULO DO FATORAL ONDE VAI SER INSERIDO MAIS UMA ESTRUTURA DE
			 * REPEIÇÃO PARA ENCOTRAR O VALOR  É DENTRO DA CONDIÇÃO VOU DECLARAR A VARIAVEL "VALOR"
			 */
			for (int valor = i; valor > 1; valor--) {
				J = J * valor;
			}

			/* LOGICA DE CALCULO PARA ENCONTRAR O VALOR DE "E" */
			E = E + (double) 1 / J;
			/* SAIDA COM OS RESULTADOS */
			System.out.printf("E =  APROXIMADAMENTE %.2f\n", E);
		}

		sc.close();
	}

}