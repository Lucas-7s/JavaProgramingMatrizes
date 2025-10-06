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
		int resultado[][] = new int[2][t];
		
		//Intro
		System.out.println("=".repeat(55));
		System.out.println(" ".repeat((55 - titulo.length())/2) + titulo.toUpperCase());
		System.out.println("=".repeat(55) + "\n");
		
		System.out.println("Matriz:");
		
		//Dupla de for que circula por toda a matriz
		for(int l = 0; l < matriz.length; l++) { // l = linha
			for(int c = 0; c < matriz[l].length; c++) { //c = coluna
				matriz[l][c] = (int)(Math.random()*10); //popula matriz com valor aleatório de 0 a 10
				System.out.print(l + ";" + c + " = " + matriz[l][c] + " | ");
				
				if(l == 0) resultado[0][0] += matriz[l][c];
				if(l == 1) resultado[0][1] += matriz[l][c];
				if(l == 2) resultado[0][2] += matriz[l][c];
				if(l == 3) resultado[0][3] += matriz[l][c];
				
				if(c == 0) resultado[1][0] += matriz[l][c];
				if(c == 1) resultado[1][1] += matriz[l][c];
				if(c == 2) resultado[1][2] += matriz[l][c];
				if(c == 3) resultado[1][3] += matriz[l][c];
				
				
			}
			System.out.println("");
		}
		
		System.out.println("\n" + "Soma dos Valores da Matriz (linha e Coluna):");
		
		for(int l = 0; l < resultado.length; l++) {
			for(int c = 0; c < resultado[l].length; c++) {
				
				if(l == 0) {
					if(c == 0) System.out.println("Soma da linha " + (c+1) + ": " + resultado[l][c]);
					if(c == 1) System.out.println("Soma da linha " + (c+1) + ": " + resultado[l][c]);
					if(c == 2) System.out.println("Soma da linha " + (c+1) + ": " + resultado[l][c]);
					if(c == 3) System.out.println("Soma da linha " + (c+1) + ": " + resultado[l][c]);
				}
				if(l == 1) {
					if(c == 0) System.out.println("Soma da coluna " + (c+1) + ": " + resultado[l][c]);
					if(c == 1) System.out.println("Soma da coluna " + (c+1) + ": " + resultado[l][c]);
					if(c == 2) System.out.println("Soma da coluna " + (c+1) + ": " + resultado[l][c]);
					if(c == 3) System.out.println("Soma da coluna " + (c+1) + ": " + resultado[l][c]);
				}
			}
		}
		
		System.out.println("\n" + "=".repeat(55));

	}

}
