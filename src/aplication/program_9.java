package aplication;

import java.util.Scanner;

public class program_9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// DECLARA��O DE VARIAVEL.
		int filho, totalpers = 0, totalCrian, soma = 0, mediaFilho;
		double salary = 0.0, totalSalary = 0.0, mediaSalary, maiorSalary = 0.0, porc = 0.0;

		/*
		 * ESTRUTURA DE REPETI��O, VAI CONTINUAR VOLTANDO ENQUANDO O SALARIO DIGITADO
		 * FOR MAIOR OU IGUAL A ZERO SENDO ASSIM SOMENTE NUMEROS POSITIVOS
		 */

		while (salary >= 0) {

			System.out.print("Digite o valor do salario: ");
			salary = sc.nextDouble();
			// CALCULO PARA SABER O TOTAL DO SALARIO GERADO AO LONGO DA REPRI��O E GRAVANDO
			// NA VARIAVEL "totalSalary".
			totalSalary = totalSalary + salary;
			// CALCULO PARA SABER A MEDIA DE SALARIO ENTRE O NUMERO TOTAL DE HABITANTES
			// GERADO AO LONGO DA REPETI��O.
			mediaSalary = totalSalary / ((double) totalpers);
			// VARIAVEL PARA SOMAR O NUMERO DE HABITANTES GERADO AO LONGO DO COMANDO.
			totalpers++;
			/*
			 * ADICIONEI UM SCANNER NESTA PARTE PARA FACILIDAR NA HORA DA EXECU��O DO
			 * PROGRAMA, ENTAO � NECESSARIO DAR UM ENTER A MAIS NO INICIO DO PROGRAMA
			 */
			sc.nextLine();
			System.out.print("Digite o numero de filhos: ");
			filho = sc.nextInt();
			// CALCULO PARA SOMAR O NUMERO DE FILHOS AO LONGO DA REPETI��O.
			totalCrian = soma + filho;
			// CALCULO PARA REALIZAR A MEDIA DE FILHOS POR HABITANTES COM BASE NO TOTAL DE
			// HABITANTES E FILHOS.
			mediaFilho = totalCrian / totalpers;
            // CONDICIONAMENTO PARA SABER QUAL � O MAIOR SALARIO ENTRE TODOS DIGITADOS. 
			if (maiorSalary < salary) {
				maiorSalary = salary;
				System.out.printf("Maior sal�rio: %.2f\n ", maiorSalary);
			}
			/*
			 * CONDICIONAMENTO PARA SABER QUAL HABITANTE RECEBE MENOS OU IGUA A R$ 100,00 �
			 * REALIZAR O PERCETUAL ENTRE O TATOL DE HABITANTES.
			 */
			if (salary <= 100) {
				porc = (porc / totalpers) * 100;
				System.out.printf("Percentual de pessoas com sal�rio at� R$100,00: %.2f%%\n", porc);
			}
            // SA�DAS 
			System.out.println("Total de habitante: " + totalpers);
			System.out.println("M�dia do n�mero de filhos: " + mediaFilho);
			System.out.printf("M�dia do sal�rio da popula��o: R$ %.2f\n", mediaSalary);
			System.out.printf("Percentual de pessoas com sal�rio at� R$100,00: %.1f%%\n", porc);

		}

		sc.close();

	}
}
