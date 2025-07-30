package com.lucas.javatraining;

import java.util.Random;

public class Ex05MatrizTransposta {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		//declaracao de variaveis
		String titulo = "Programa que converte Matriz 2x3 para uma 3x2 (números aleatórios)";
		int matriz [][] = new int [3][2];
		int transposta [][] = new int [2][3];
		
		//intro
		System.out.println("=".repeat(70));
		System.out.println(" ".repeat((70 - titulo.length())/2) + titulo.toUpperCase());
		System.out.println("=".repeat(70) + "\n");

		System.out.println("Matriz 2x3: ");
		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				matriz[l][c] = (int)(Math.random()*10);
				System.out.print(matriz[l][c] + " | ");
			}
			System.out.println("");
		}
		
		System.out.println("\n" + "=".repeat(70));

	}

}
