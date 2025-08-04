/* Exercicio
 * Matriz Identidade
 * Crie um método que gera uma matriz identidade de ordem n (n x n).
 */

package com.lucas.javatraining;

import java.util.Random;

public class Ex07MatrizIdentidade {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		//declaração de variáveis
		String titulo = "Programa Que Faz Matriz Identidade de ordem n x n";
		int numMatriz = (int)(Math.random()*5)+2;
		
		int matrizIdentidade[][] = new int [numMatriz][numMatriz];
		
		//intro
		System.out.println("=".repeat(50));
		System.out.println(" ".repeat((50 - titulo.length())/2) + titulo.toUpperCase());
		System.out.println("=".repeat(50) + "\n");
		
		System.out.println("Matriz " + matrizIdentidade.length + "x" + matrizIdentidade[0].length + ":");
		for(int l = 0; l < matrizIdentidade.length; l++) {
			for(int c = 0; c < matrizIdentidade[l].length; c++) {
				
				//verifica se o numero que ta na linha é igual ao da coluna
				if(l == c) {
					matrizIdentidade[l][c] = 1;
				}
				System.out.print(matrizIdentidade[l][c] + " | ");
			}
			System.out.println("");
		}
		

		System.out.println("\n" + "=".repeat(50));
	}

}
