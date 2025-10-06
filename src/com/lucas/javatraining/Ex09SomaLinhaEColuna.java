/* Exercicio
 * Soma de Linhas e Colunas
 * Dada uma matriz 4x4, crie um método que retorna a soma de cada linha e cada coluna.
 */

package com.lucas.javatraining;

import java.util.Random;

public class Ex09SomaLinhaEColuna {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		// Declaração de variáveis
		String titulo = "Soma de Linhas e Colunas";
		int t = 4; //tamanho matriz
		int matriz[][] = new int[t][t];
		int resultado[][] = new int[t][t];
		
		//Intro
		System.out.println("=".repeat(55));
		System.out.println(" ".repeat((55 - titulo.length())/2) + titulo.toUpperCase());
		System.out.println("=".repeat(55) + "\n");
		
		System.out.println("Matriz:");
		
		//Dupla de for que circula por toda a matriz
		for(int l = 0; l < matriz.length; l++) {
			for(int c = 0; c < matriz[l].length; c++) {
				matriz[l][c] = (int)(Math.random()*10); //popula matriz com valor aleatório de 0 a 10
				System.out.print(matriz[l][c] + " | ");
				
				if(l == 0) resultado[0][c] += matriz[l][c];
				if(l == 1) resultado[1][c] += matriz[l][c];
				if(l == 2) resultado[2][c] += matriz[l][c];
				if(l == 3) resultado[3][c] += matriz[l][c];
				
				if(c == 0) resultado[l][1] += matriz[l][c];
				if(c == 1) resultado[l][1] += matriz[l][c];
				if(c == 2) resultado[l][1] += matriz[l][c];
				if(c == 3) resultado[l][1] += matriz[l][c];
				
				
			}
			System.out.println("");
		}
		
		System.out.println("\n" + "Soma dos Valores da Matriz (linha e Coluna):");
		
		
		
		
		
		System.out.println("\n" + "=".repeat(55));

	}

}
