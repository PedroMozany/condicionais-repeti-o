package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class program_3 {

	public static void main(String[] args) throws ParseException {
		/*
		 * ESTOU USANDO AS CLASSES CALENDAR E DATE DA JDK PARA TER UM RESOLTADO MAIS
		 * PRECISO É DEIXAR O PROGRAMA MENOS VERBOSO. 
		 */

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal = Calendar.getInstance();

		/* DIGIDANDO DATA DE NASCIMENTO ULTILIZANDO A CLASSE DATE E CALENDAR */

		System.out.print("Data de nascimento: ");
		Date birth = sdf.parse(sc.next());
		cal.setTime(birth);

		/*
		 * EXTRAINDO ANO DE NASCIMENTO PARA REALIZAR O CALCULO É GRAVANDO EM UMA VARIAEL
		 * INTEIRA
		 */

		int anoNasc = cal.get(Calendar.YEAR);

		/* GERANDO ANO ATUAL PELA CLASSE DATE DO JAVA É GRAVANDO EM UMA VARIAVEL DATE */

		Date date = new Date();
		cal.setTime(date);

		/*
		 * EXTRAINDO ANO ATUAL PARA REALIZAR O CALCULO É GRAVANDO EM UMA VARIAEL INTEIRA
		 */

		int anoAtual = cal.get(Calendar.YEAR);

		/* ALGARITIMO DE CALCULO PARA SABER A IDADE ULTILIZADO DOIS INTEIROS */

		int idade = anoAtual - anoNasc;
		System.out.println("Idade Atual: " + idade);

		/* LOGICA PARA SABER SE PESSOA FEZ OU NAO ANIVERSARIO ESSE ANO */

		System.out.print("Já fez aniversario esse ano S/N: ");
		char niver;
		niver = sc.next().charAt(0);

		/* LOGICA PARA SABER A PESSOA TEM IDADE PARA TER CNH */

		if (idade <= 18) {
			System.out.print("Nao pode ter Carta de Habilitação.");
		} else {
			System.out.println("Pode ter Carta de Habilitação.");
		}

		sc.close();
	}
}