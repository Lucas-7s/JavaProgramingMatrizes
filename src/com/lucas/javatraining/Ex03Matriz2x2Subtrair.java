package com.lucas.javatraining;

import java.util.Random;

public class Ex03Matriz2x2Subtrair {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		//intro
		String titulo = "Matriz 2x2 - Matriz 2x2 (com números aleatórios)";
		System.out.println("=".repeat(55));
		System.out.println(" ".repeat((55 - titulo.length()) / 2) + titulo.toUpperCase());
		System.out.println("=".repeat(55) + "\n");
				
		int [][] matriz1 = new int[2][2];
		int [][] matriz2 = new int[2][2];
		int [][] matrizResultado = new int[2][2];
		
		//popula matriz1
		System.out.println("Matriz A:");
		for (int l = 0; l < matriz1.length; l++) {
			for (int c = 0; c < matriz1[l].length; c++) {
				matriz1[l][c] = (int)(Math.random()*10);
				System.out.print(matriz1[l][c] + " | ");
			}
			System.out.println("");
		}
		
		//popula matriz2
		System.out.println("\n" + "Matriz B:");
		for (int l = 0; l < matriz2.length; l++) {
			for (int c = 0; c < matriz2[l].length; c++) {
				matriz2[l][c] = (int)(Math.random()*10);
				System.out.print(matriz2[l][c] + " | ");
			}
			System.out.println("");
		}

		//resultado
		System.out.println("\n" + "Subtração:");
		for(int l = 0; l < matrizResultado.length; l++) {
			for (int c = 0; c < matrizResultado[l].length; c++) {
				matrizResultado[l][c] = matriz1[l][c] - matriz2[l][c];
				System.out.print(matrizResultado[l][c] + " | ");
			}
			System.out.println("");
		}
		
		System.out.println("\n" + "=".repeat(55));
	}

}
