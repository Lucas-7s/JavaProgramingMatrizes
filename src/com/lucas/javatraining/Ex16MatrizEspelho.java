/* Exercicio
 * Matriz Espelho
 * Crie um método que gere a matriz espelho (reflexão) de uma matriz 3x3
 */

package com.lucas.javatraining;

import java.util.Random;

public class Ex16MatrizEspelho {
	public static void main(String[] args) {
		
		Random r = new Random();
		
		//Declaração de variáveis:
		int t = 4; //tamanho matriz
		int matriz [][] = new int[t][t];
		int matrizEspelho [][] = new int[t][t];
		String titulo = "Matriz Aleatória, imprima a Matriz Espelho";
		
		//intro:
		System.out.println("=".repeat(70));
		System.out.println(" ".repeat((70 - titulo.length())/2) + titulo.toUpperCase());
		System.out.println("=".repeat(70) + "\n");
		
		System.out.println("Matriz " + t + "x" + t + ": ");
		
		//popula a primeira matriz com valor aleatório
		for(int l = 0; l < matriz.length; l++) {
			for(int c = 0; c < matriz[l].length; c++) {
				matriz[l][c] = (int)(Math.random()*10);
				System.out.print(matriz[l][c] + " | ");
			}
			System.out.println("");
		}
		
		//matriz espelho
		System.out.println("\n" + "Matriz Espelho " + t + "x" + t + ":");
		
		for(int l = 0; l < matrizEspelho.length; l++) {
			for(int c = 0; c < matrizEspelho[l].length; c++) {
				int e = (matrizEspelho[l].length - 1) - c; //calculo chave que pega o valor reverso da matriz
				matrizEspelho[l][c] = matriz[l][e];
				System.out.print(matrizEspelho[l][c] + " | ");
			}
			System.out.println("");
		}
		
		System.out.println("\n" + "=".repeat(70));
	}

}
