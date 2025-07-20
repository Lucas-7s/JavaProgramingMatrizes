/* Exercicio
 * Crie uma matriz 3x3 de inteiros e preencha com números aleatórios de 0 a 9. Imprima a matriz.
 */

package com.lucas.javatraining;

import java.util.Random;

public class Ex01Matriz3x3Aleatorio {
	public static void main(String[] args) {
		
		//intro
		String titulo = "Matriz 3x3 com números aleatórios";
		System.out.println("=".repeat(55));
		System.out.println(" ".repeat((55 - titulo.length()) / 2) + titulo);
		System.out.println("=".repeat(55) + "\n");
		
		Random r = new Random();
		int [][] matriz = new int [3][3];
		
		//popula matriz com random
		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				matriz[l][c] = (int)(Math.random()*10);
				System.out.print(matriz[l][c] + " | ");
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		//reexibe a matriz com sua posição
		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				System.out.print("Posição " +l + "," + c + ": " + matriz[l][c] + " | ");
			}
			System.out.println("");
		}
		System.out.println("\n" + "=".repeat(55));
	}

}

