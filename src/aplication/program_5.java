package aplication;

import java.util.Scanner;

public class program_5 {

	public static void main(String[] args) {
		
		/* DECLARA��O DE VARIAVEL: VALOR DA DIARIA PROPOSTO POR MIM. QUANTIDADE DE APARTAMENTOS SUGERITO PELO PROBLEMA  */

		Scanner sc = new Scanner(System.in);
		double diaria = 78.0;
		int quantidade = 75;
	    System.out.println("VALOR DA DIARIA: R$ " + diaria);
	    
	    
		/* CALCULO PARA OBTER O VALOR DA PROMO��O */
		
		double promo = diaria - diaria * 0.25;
		
		System.out.println("O valor da di�ria promocional: R$ " + promo);
		
		/* CALCULO PARA SABER O TOTAL DE LUCRO COM A PROMO��O DE DESCONTO */
		
		double lucroPromo = (quantidade * 0.80) * promo;
		
		System.out.println("Valor total arrecadado com 80% de ocupa��o e di�ria promocional: R$ " + lucroPromo);

		/*CALCULO PARA SABER LUCRO SEM PROMO��O */
		
		double lucroNormal = (quantidade * 0.50)* diaria;
		
        System.out.println("Valor total arrecadado com 50% de ocupa��o e di�ria normal: R$ " + lucroNormal );
		
        /*CALCULO PARA SABER A DIFERENCIA ENTRE PRE�O NORMAL � COM DESCONTO */
        
		double dif =  lucroPromo - lucroNormal;
		
		System.out.println("Diferen�a entre estes dois valores: R$ " + dif);
		
		
		sc.close();
	}
}