/* Exercicio
 * Soma de Elementos da Matriz
 * Crie uma matriz 2x2 e calcule a soma de todos os seus elementos.
 */

package com.lucas.javatraining;

import java.util.Random;

public class Ex03Matriz2x2Soma {
	public static void main(String[] args) {
		
		Random r = new Random();

		//intro
		String titulo = "Matriz 2x2 + Matriz 2x2 (com números aleatórios)";
		System.out.println("=".repeat(55));
		System.out.println(" ".repeat((55 - titulo.length()) / 2) + titulo.toUpperCase());
		System.out.println("=".repeat(55) + "\n");
		
		//declarando as matrizes
		int [][] matriz1 = new int [2][2];
		int [][] matriz2 = new int [2][2];
		int [][] matrizSoma = new int [2][2];
		
		System.out.println("Matriz 1: ");
		
		//popula matriz1 com random
		for (int l = 0; l < matriz1.length; l++) {
			for (int c = 0; c < matriz1[l].length;c++) {
				matriz1[l][c] = (int)(Math.random()*10);
				
				System.out.print(matriz1[l][c] + " | ");
			}
			System.out.println("");
		}
		
		System.out.print("\n" + "+" +  "\n\n");
		System.out.println("Matriz 2: ");
		
		//popula matriz2 com random
		for (int l = 0; l < matriz2.length;l++) {
			for (int c = 0; c < matriz2[l].length; c++) {
				matriz2[l][c] = (int)(Math.random()*10);
				
				System.out.print(matriz2[l][c] + " | ");
			}
			System.out.println("");
		}
		
		System.out.print("\n" + "=" +  "\n\n");
		System.out.println("Soma: ");
		
		//Soma matriz1 + matriz2:
		
		for (int l = 0; l < matrizSoma.length; l++) {
			for(int c = 0; c < matrizSoma[l].length; c++) {
				matrizSoma[l][c] = matriz1[l][c] + matriz2[l][c];
				System.out.print(matrizSoma[l][c] + " | ");
			}
			System.out.println("");
		}
		
		System.out.println("\n" + "=".repeat(55));
	}
}
