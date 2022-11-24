package com.aepi;

import java.util.Scanner;

public class EjercicioDos {

	public static void main(String[] args) {
		
		System.out.println("\nPEDIR NUMERO N, N SUELDOS Y MOSTRAR SUELDO MÁXIMO");
		
		Scanner sc = new Scanner(System.in);
		int n, sueldo, sueldoMax = 0;
		
		System.out.println("Introduce un número: ");
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("\nIntroduce un sueldo: ");
			sueldo = sc.nextInt();
			if(sueldo > sueldoMax) {
				sueldoMax = sueldo;
			}	
		}
		
		System.out.println("\nEl sueldo máximo introducido es: " + sueldoMax + "€.");

	}

}
