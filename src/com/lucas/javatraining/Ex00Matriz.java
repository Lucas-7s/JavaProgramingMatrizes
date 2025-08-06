package com.lucas.javatraining;

import java.util.Random;

public class Ex00Matriz {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		//declaração de variáveis
		String titulo = "Programa que Faz Matriz com Números Aleatórios";
		int matriz[][] = new int[3][3];
		
		//intro
		System.out.println("=".repeat(70));
		System.out.println(" ".repeat((70 - titulo.length())/2) + titulo.toUpperCase());
		System.out.println("=".repeat(70) + "\n");
		
		//looping que passa por todas as possições da matriz
		System.out.println("Matriz 3x3:");
		for(int linha = 0; linha < matriz.length; linha++) { //l=linha
			for(int coluna = 0; coluna < matriz[linha].length; coluna++) { //c=coluna
				matriz[linha][coluna] = (int)(Math.random()*10); //popula matriz na posição [l][c] com números aleatórios com random
				System.out.print(matriz[linha][coluna] + " | "); //mostra resultado na posição [l][c]
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		//exibe novamente a matriz mas com a posição de cada número na matriz
		for(int l = 0; l < matriz.length; l++) {
			for(int c = 0; c < matriz[l].length; c++) {
				System.out.print("linha " + l + ", coluna " + c + ": " + matriz[l][c] + " | ");
			}
			System.out.println("");
		}
		
		System.out.println("\n" + "=".repeat(70));

	}

}
