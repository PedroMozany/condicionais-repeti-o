package aplication;

import java.util.Scanner;

public class program_4 {

	public static void main(String[] args) {
		
		/* DECLARA��O DE VARIAVEL */

		Scanner sc = new Scanner(System.in);
		double N;
		
		/* ENTRADA DE DADO */
		System.out.print("Informa a nota: ");
		N = sc.nextDouble();
		
		/* CONDICIONAMENTO DE DADOS PARA SABER ONDE O VALOR SE ENQUADRA SEM TRATAMENTO DE EXCE��O */
		
		if(N >= 8 && N <= 10) {
			System.out.print(" �TIMA ");
		}
		else if(N >= 7 && N < 8) {
			System.out.print(" BOM ");
		}
		else if(N >= 5 && N < 7) {
			System.out.print(" REGULAR ");
		}
		else {
		System.out.println(" INSATISFAT�RIO ");
			
		}

		sc.close();
	}
}