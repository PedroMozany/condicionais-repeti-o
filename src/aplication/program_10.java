package aplication;

import java.util.Scanner;

public class program_10 {

	public static void main(String[] args) {
		/*
		 * DECLARAÇÃO DE VARIAVEL, "S" VAI INICIAR COM 1. N SERA O NOSSO NUMERO INTEIRO
		 * E POSITICO INICIANDO COM "2" COMO NO PROBLEMA
		 */

		Scanner sc = new Scanner(System.in);
		int n;
		double S = 1;
		
		System.out.print("Enter with number: ");
		n = sc.nextInt();
		
		
		/*
		 * ESTRUTURA DE REPETIÇÃO "for" VAI SER ULTILIZADA PARA REPETIR ATE ENCOTRAR O VALOR DESEJADO
		 */
		for(int i = 1; i <= n; i++) {
			/* LOGICA DE CALCULO PARA ENCONTRAR O VALOR DE "s" */
			S = S + (double) 1 / n;
			/* SAIDA COM OS RESULTADOS */
			System.out.printf("S = %.2f\n", S);
		}

		sc.close();
	}

}