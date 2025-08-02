/* Exercicio
 * Matriz Diagonal
 * Crie uma matriz 4x4 e preencha com números aleatórios. Verifique e imprima os elementos da diagonal principal.
 */

package com.lucas.javatraining;

import java.util.Random;

public class Ex11MatrizDiagonal {

	public static void main(String[] args) {

		Random r = new Random();
		
		//declaração de variáveis
		String titulo =  "Programa que Imprime Dados da Diagonal de uma Matriz 4x4 Aleatória";
		int matriz[][] = new int[4][4];
		
		//intro
		System.out.println("=".repeat(70));
		System.out.println(" ".repeat((70 - titulo.length())/2) + titulo.toUpperCase());
		System.out.println("=".repeat(70) + "\n");
		
		//popula matriz com valor aleatório
		System.out.println("Matriz 4x4:");
		for(int l = 0; l < matriz.length; l++) {
			for(int c =0; c <matriz[l].length; c++) {
				matriz[l][c] = (int)(Math.random()*10);
				System.out.print(matriz[l][c] + " | ");
			}
			System.out.println("");
		}
				
		//exibe somente a diagonal:
		System.out.println("\n" + "Diagonal da Matriz 4x4:");
		for(int l = 0; l < matriz.length; l++) {
			for(int c = 0; c < matriz[l].length; c++) {
				
				//verifica se o numero na linha é igual a coluna
				if(l == c) {
					System.out.print(matriz[l][c]);
					
					//adiciona a pontuação: se está no fim da matriz coloque . caso contrário coloque ,
					if(l == matriz.length-1 && c == matriz.length-1) {
						System.out.println(".");
					} else {
						System.out.print(", ");
					}
				}
			}
		}
		
		System.out.println("\n" + "=".repeat(70));

	}

}
