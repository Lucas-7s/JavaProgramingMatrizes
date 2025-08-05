/* Exercicio
 * Soma Interna de Matriz
 * Crie uma Matriz e some todos os valores internos e mostre o resultado
 */

package com.lucas.javatraining;

import java.util.Random;

public class Ex08SomaInternaMatrizes {

	public static void main(String[] args) {

		Random r = new Random();

		//declaração de variáveis
		String titulo = "Programa: Soma Valores de uma Mastriz";
		int t = 4; //tamanho da matriz
		int matriz[][] = new int[t][t];
		int soma = 0;
		
		//intro
		System.out.println("=".repeat(50));
		System.out.println(" ".repeat((50 - titulo.length())/2) + titulo.toUpperCase());
		System.out.println("=".repeat(50) +"\n");
		
		//looping que passa por todas as possições da matriz
		System.out.println("Matriz" + t + "x" + t + ":");
		for(int l = 0; l < matriz.length; l++) {
			for(int c = 0; c < matriz[l].length; c++) {
				matriz[l][c] = (int)(Math.random()*10);//popula a matriz
				System.out.print(matriz[l][c] + " | ");//mostra o valor no local l (linha) c (coluna)
				soma += matriz[l][c];//adiciona o valor na variavel
			}
			System.out.println("");
		}
		
		System.out.println("\n" + "Soma de toda a matriz = " + soma);
		
		System.out.println("\n" + "=".repeat(50));
	}

}
