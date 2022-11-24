package com.aepi;

import java.util.Scanner;

public class EjercicioUno {

	public static void main(String[] args) {
		System.out.println("\nDADAS 6 NOTAS, ESCRIBIR APROBADOS, SUSPENSOS Y CONDICIONADOS");
		
		int nota = 0, aprobados = 0, condicionados = 0, suspensos = 0;
		Scanner sc = new Scanner(System.in);
		
		
		for(int i = 0; i < 6; i++) {
			System.out.println("Escribe 1 nota del 0 al 10: ");
		
			nota = sc.nextInt();
			if(nota < 4) {
				suspensos++;
			}else if(nota == 4) {
				condicionados++;
			}else {
				aprobados++;
			}		
		}
		
		System.out.println("Alumnos suspensos: " + suspensos + ".\nAlumnos condicionados: " + condicionados + ".\nAlumnos aprobados " + aprobados + ".");

	}

}
