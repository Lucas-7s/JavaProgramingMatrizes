/* Exercicio
 * Verificar Matriz Quadrada
 * Crie uma matriz e escreva um método que verifique se ela é quadrada (número de linhas igual ao número de colunas).
 */

package com.lucas.javatraining;

import java.util.Random;

public class Ex06MatrizQuadrada {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		//declaração de variáveis:
		String titulo = "Programa que Verificar se a Matriz é Quadrada";
		String subTitulo = "(número de linhas igual ao número de colunas)";
		
		int matriz[][] = new int[(int)((Math.random()*3)+1)][(int)((Math.random()*3)+1)];
		
		//intro
		System.out.println("=".repeat(55));
		System.out.println(" ".repeat((55 - titulo.length())/2) + titulo.toUpperCase());
		System.out.println(" ".repeat((55 - titulo.length())/2) + subTitulo);
		System.out.println("=".repeat(55) + "\n");
		
		//pupula e exibe a matriz e seu tamanho, trecho desnecessário, mas só para exibir e praticar
		System.out.println("Matriz " + matriz.length + "x" + matriz[0].length + ":");
		for(int l = 0; l < matriz.length; l++) {
			for(int c = 0; c < matriz[l].length; c++) {
				matriz[l][c] = (int)(Math.random()*10);
				System.out.print(matriz[l][c] + " | ");
			}
			System.out.println("");
		}
		
		System.out.print("\n" + "a Matriz ");
		
		if(matriz.length == matriz[0].length) {
			System.out.println("é quadrada");
		} else {
			System.out.println("não é quadrada");
		}
		
		System.out.println("\n" + "=".repeat(55));
	}

}
