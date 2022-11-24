package com.aepi;

import java.util.Scanner;

public class EjercicioTres {

	public static void main(String[] args) {
		
		System.out.println("\nPEDIR 10 NUMEROS Y MOSTRAR SI ALGUNO ES NEGATIVO");
		
		Scanner sc = new Scanner(System.in);
		int num, num_neg = 0;
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Introduce un número: ");
			num = sc.nextInt();
			
			if(num < 0) {
				num_neg++;
			}
		}

		if(num_neg == 0) {
			System.out.println("\nNo hay negativos");
		}else if (num_neg == 1) {
			System.out.println("\nHay un número negativo");
		}else if (num_neg > 1) {
			System.out.println("\nHay varios númeors negativos");
		}

	}

}
