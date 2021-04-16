package aplication;

import java.util.Scanner;

public class program_5 {

	public static void main(String[] args) {
		
		/* DECLARAÇÃO DE VARIAVEL: VALOR DA DIARIA PROPOSTO POR MIM. QUANTIDADE DE APARTAMENTOS SUGERITO PELO PROBLEMA  */

		Scanner sc = new Scanner(System.in);
		double diaria = 78.0;
		int quantidade = 75;
	    System.out.println("VALOR DA DIARIA: R$ " + diaria);
	    
	    
		/* CALCULO PARA OBTER O VALOR DA PROMOÇÃO */
		
		double promo = diaria - diaria * 0.25;
		
		System.out.println("O valor da diária promocional: R$ " + promo);
		
		/* CALCULO PARA SABER O TOTAL DE LUCRO COM A PROMOÇÃO DE DESCONTO */
		
		double lucroPromo = (quantidade * 0.80) * promo;
		
		System.out.println("Valor total arrecadado com 80% de ocupação e diária promocional: R$ " + lucroPromo);

		/*CALCULO PARA SABER LUCRO SEM PROMOÇÃO */
		
		double lucroNormal = (quantidade * 0.50)* diaria;
		
        System.out.println("Valor total arrecadado com 50% de ocupação e diária normal: R$ " + lucroNormal );
		
        /*CALCULO PARA SABER A DIFERENCIA ENTRE PREÇO NORMAL É COM DESCONTO */
        
		double dif =  lucroPromo - lucroNormal;
		
		System.out.println("Diferença entre estes dois valores: R$ " + dif);
		
		
		sc.close();
	}
}