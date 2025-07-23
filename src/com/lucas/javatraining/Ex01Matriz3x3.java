/* Exercicio
 * Criar e Imprimir uma Matriz
 * Crie uma matriz 3x3 de inteiros e preencha com números de 1 a 9. Imprima a matriz.
 */

package com.lucas.javatraining;

public class Ex01Matriz3x3 {
	public static void main(String[] args) {
		
		//intro
		String titulo = "Matriz 3x3 com números de 1 à 9";
		System.out.println("=".repeat(55));
		System.out.println(" ".repeat((55 - titulo.length()) / 2) + titulo);
		System.out.println("=".repeat(55) + "\n");
		
		//inicia a matriz
		int [][] matriz = new int [3][3];
		
		//popula matriz com soma
		int contador = 0;
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				contador++;
				matriz[linha][coluna] = contador;
				System.out.print(matriz[linha][coluna] + " | ");
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

