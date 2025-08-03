/* Exercicio
 * Contar Elementos Positivos
 * Crie uma matriz 4x4 e conte quantos elementos são positivos, negativos e zeros.
 */

package com.lucas.javatraining;

import java.util.Random;

public class EX12ElementosPositivos {

	public static void main(String[] args) {

		Random r = new Random();
		
		//Declaração de variáveis
		String titulo = "Programa que Conta Elementos Positivos em uma Matriz";
		int contarPositivos = 0;
		int contarNegativos = 0;
		int contarZeros = 0;
		int x = 5; //tamanho da matriz, fácil alteração
		int total = x*x; //tamanho total de números na matriz
		int matriz[][] = new int[x][x];
		
		//Intro
		System.out.println("=".repeat(70));
		System.out.println(" ".repeat((70 - titulo.length())/2) + titulo.toUpperCase());
		System.out.println("=".repeat(70) + "\n");
		
		System.out.println("Matriz " + x + "x" + x + ":");
		for(int l = 0; l < matriz.length; l++) {
			for(int c = 0; c < matriz[l].length; c++) {
				matriz[l][c] = (int)((Math.random()*20)-10); //popula matriz entre -10 à 10
				
				if(matriz[l][c] >= 0) {
					System.out.print(" " + matriz[l][c] + " | ");
					if(matriz[l][c] > 0) contarPositivos++; //se positivo conta.
					if(matriz[l][c] == 0) contarZeros++; //se zero conta.
				} else {
					System.out.print(matriz[l][c] + " | ");
				}
			}
			System.out.println();
		}
		
		contarNegativos = total - contarPositivos - contarZeros; //negativos = total - positivos e zeros.
		
		System.out.println("\n" + "Matriz " + x +"x" + x + " contém " + total + " números");
		System.out.println("Contem: " + contarPositivos + " Números positívos");
		System.out.println("Contem: " + contarNegativos + " Números negativos ");
		System.out.println("Contem: " + contarZeros + " Zeros ");
		
		
		System.out.println("\n" + "=".repeat(70));

	}

}
