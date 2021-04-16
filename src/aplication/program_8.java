package aplication;

import java.util.Scanner;

public class program_8 {

	public static void main(String[] args) {
		/*
		 * DECLARA��O DE VARIAVEL, "E" � "J" V�O INICIAR COM 1. "n" SERA O NOSSO NUMERO INTEIRO
		 * E POSITICO
		 */

		Scanner sc = new Scanner(System.in);
		int n;
		double E = 1, J = 1;

		/* ENTRADA DO VALOR DE INTEIRO "n" */
		System.out.print("Enter with number: ");
		n = sc.nextInt();

		/*
		 * ESTRUTURA DE REPETI��O PARA CHEGAR NO RESULTADO SOLICITADO, ONDE "N" SERA A
		 * CONDI��O QUE DETERMINAR� O FIM DA REPETI��O
		 */
		for (int i = 1; i <= n; i++) {
			/*
			 * LOGICA DE CALCULO DO FATORAL ONDE VAI SER INSERIDO MAIS UMA ESTRUTURA DE
			 * REPEI��O PARA ENCOTRAR O VALOR  � DENTRO DA CONDI��O VOU DECLARAR A VARIAVEL "VALOR"
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