package aplication;

import java.util.Scanner;

public class program_9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// DECLARAÇÃO DE VARIAVEL.
		int filho, totalpers = 0, totalCrian, soma = 0, mediaFilho;
		double salary = 0.0, totalSalary = 0.0, mediaSalary, maiorSalary = 0.0, porc = 0.0;

		/*
		 * ESTRUTURA DE REPETIÇÃO, VAI CONTINUAR VOLTANDO ENQUANDO O SALARIO DIGITADO
		 * FOR MAIOR OU IGUAL A ZERO SENDO ASSIM SOMENTE NUMEROS POSITIVOS
		 */

		while (salary >= 0) {

			System.out.print("Digite o valor do salario: ");
			salary = sc.nextDouble();
			// CALCULO PARA SABER O TOTAL DO SALARIO GERADO AO LONGO DA REPRIÇÃO E GRAVANDO
			// NA VARIAVEL "totalSalary".
			totalSalary = totalSalary + salary;
			// CALCULO PARA SABER A MEDIA DE SALARIO ENTRE O NUMERO TOTAL DE HABITANTES
			// GERADO AO LONGO DA REPETIÇÃO.
			mediaSalary = totalSalary / ((double) totalpers);
			// VARIAVEL PARA SOMAR O NUMERO DE HABITANTES GERADO AO LONGO DO COMANDO.
			totalpers++;
			/*
			 * ADICIONEI UM SCANNER NESTA PARTE PARA FACILIDAR NA HORA DA EXECUÇÃO DO
			 * PROGRAMA, ENTAO É NECESSARIO DAR UM ENTER A MAIS NO INICIO DO PROGRAMA
			 */
			sc.nextLine();
			System.out.print("Digite o numero de filhos: ");
			filho = sc.nextInt();
			// CALCULO PARA SOMAR O NUMERO DE FILHOS AO LONGO DA REPETIÇÃO.
			totalCrian = soma + filho;
			// CALCULO PARA REALIZAR A MEDIA DE FILHOS POR HABITANTES COM BASE NO TOTAL DE
			// HABITANTES E FILHOS.
			mediaFilho = totalCrian / totalpers;
            // CONDICIONAMENTO PARA SABER QUAL É O MAIOR SALARIO ENTRE TODOS DIGITADOS. 
			if (maiorSalary < salary) {
				maiorSalary = salary;
				System.out.printf("Maior salário: %.2f\n ", maiorSalary);
			}
			/*
			 * CONDICIONAMENTO PARA SABER QUAL HABITANTE RECEBE MENOS OU IGUA A R$ 100,00 É
			 * REALIZAR O PERCETUAL ENTRE O TATOL DE HABITANTES.
			 */
			if (salary <= 100) {
				porc = (porc / totalpers) * 100;
				System.out.printf("Percentual de pessoas com salário até R$100,00: %.2f%%\n", porc);
			}
            // SAÍDAS 
			System.out.println("Total de habitante: " + totalpers);
			System.out.println("Média do número de filhos: " + mediaFilho);
			System.out.printf("Média do salário da população: R$ %.2f\n", mediaSalary);
			System.out.printf("Percentual de pessoas com salário até R$100,00: %.1f%%\n", porc);

		}

		sc.close();

	}
}
