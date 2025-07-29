/* Exercicio
 * Divisão de Elementos da Matriz
 * Crie uma matriz 2x2 e calcule a Divisão de todos os seus elementos com tratamento de erro.
 */

package com.lucas.javatraining;

import java.util.Random;

public class Ex04Matriz2x2Dividir {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		//declaração de variáveis
		String titulo = "Matriz 2x2 / Matriz 2x2 (com números aleatórios)";
		double matrizA[][] = new double [2][2];
		double matrizB[][] = new double [2][2];
		double divisao[][] = new double [2][2];
		boolean erro = false;
		
		//intro
		System.out.println("=".repeat(70));
		System.out.println(" ".repeat((70 - titulo.length())/2) + titulo.toUpperCase());
		System.out.println("=".repeat(70) + "\n");
		
		//popula a matriz a
		System.out.println("Matriz A:");
		for(int l = 0; l < matrizA.length; l++) {
			for(int c = 0; c < matrizA[l].length; c++) {
				matrizA[l][c] = (int)(Math.random()*10);
				System.out.printf("%.2f | ", matrizA[l][c]);
			}
			System.out.println("");
		}
		
		//popula a matriz b
		System.out.println("\n" + "/" + "\n\n" + "Matriz B:");
		for (int l = 0; l < matrizB.length; l++) {
			for(int c = 0; c < matrizB[l].length; c++) {
				matrizB[l][c] = (int)(Math.random()*10);
				System.out.printf("%.2f | ", matrizB[l][c]);
			}
			System.out.println("");
		}
		
		//saida
		System.out.println("\n" + "=" + "\n\n" + "Divisão:");
		for (int l = 0; l < divisao.length; l++) {
			for (int c = 0; c < divisao[l].length; c++){
				
				if(matrizB[l][c] == 0) {
					System.err.print("Erro");
					System.out.print(" | ");
					erro = true;
				} else {
					divisao[l][c] = matrizA[l][c] / matrizB[l][c];
					System.out.printf("%.2f | ",divisao[l][c]);
				}
			}
			System.out.println("");
		}
		
		if(erro == true) {
			System.err.print("\n" + "Erro");
			System.out.println(" = Não existe divisão por 0");
		}
		
		System.out.println("\n" + "=".repeat(70));
	}
}
