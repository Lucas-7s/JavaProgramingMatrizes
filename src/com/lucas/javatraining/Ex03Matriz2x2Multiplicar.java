/* Exercicio
 * Multiplicação de Elementos da Matriz
 * Crie uma matriz 2x2 e calcule a Multiplicação de todos os seus elementos.
 */

package com.lucas.javatraining;

import java.util.Random;

public class Ex03Matriz2x2Multiplicar {
	public static void main(String[] args) {
		
		Random r = new Random();
		
		//declaração de variáveis
		String titulo = "Matriz 2x2 - Matriz 2x2 (com números aleatórios)";
		int matrizA [][] = new int [2][2];
		int matrizB [][] = new int [2][2];
		int matrizMultiplicar [][] = new int [2][2];
		
		//intro
		System.out.println("=".repeat(70));
		System.out.println(" ".repeat((70 - titulo.length())/2) + titulo.toUpperCase());
		System.out.println("=".repeat(70) + "\n");
		
		//popula matriz A
		System.out.println("Matriz A:");
		for (int l = 0; l < matrizA.length; l++) {
			for (int c = 0; c < matrizA[l].length; c++) {
				matrizA[l][c] = (int)(Math.random()*10);
				System.out.print(matrizA[l][c] + " | ");
			}
			System.out.println("");
		}
		
		//popula matriz B
		System.out.print("\n" + "x" +  "\n\n");
		System.out.println("Matriz B:");
		
		for (int l = 0; l < matrizB.length; l++) {
			for (int c = 0; c < matrizB[l].length; c++) {
				matrizB[l][c] = (int)(Math.random()*10);
				System.out.print(matrizB[l][c] +  " | ");
			}
			System.out.println("");
		}
		
		//resultado
		System.out.print("\n" + "=" +  "\n\n");
		System.out.println("Multiplicar");
		
		for(int l = 0; l < matrizMultiplicar.length; l++) {
			for (int c = 0; c < matrizMultiplicar[l].length; c++){
				matrizMultiplicar[l][c] = matrizA[l][c] * matrizB[l][c];
				System.out.print(matrizMultiplicar[l][c] + " | ");
			}
			System.out.println("");
		}
		
		
		System.out.println("\n" + "=".repeat(70));
	}
}
