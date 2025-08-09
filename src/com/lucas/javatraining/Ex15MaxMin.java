/* Exercicio
 * Encontrar o Máximo e Mínimo
 * Dada uma matriz 4x4, encontre o valor máximo e mínimo e suas posições.
 */

package com.lucas.javatraining;

import java.util.Random;

public class Ex15MaxMin {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		//declaracao de variavel
		String titulo = "Programa: Em uma matriz mostra a posição do Maior e Menor Valor";
		int t = 4; //tamanho da matriz
		int matriz[][] = new int[t][t];
		int min = 10;
		int max = 0;
		String tamanhoMax = "";
		String tamanhoMin = "";
		
		
		//intro
		System.out.println("=".repeat(70));
		System.out.println(" ".repeat((70 - titulo.length())/2) + titulo.toUpperCase());
		System.out.println("=".repeat(70) + "\n");
		
		//circula por toda a matriz
		System.out.println("Matriz " + t + "x" + t + ":");
		for(int l = 0; l < matriz.length; l++) {
			for(int c = 0; c < matriz[l].length; c++) {
				matriz[l][c] = (int)(Math.random()*10); //popula a matriz posição [l] [c] com valor aleatório
				System.out.print(matriz[l][c]+ " | "); //mostra a matriz posição [l][c]
				
				//encontra o menor numero
				if(matriz[l][c] <= min) {
					min = matriz[l][c];
				}
				
				//encontra o maior numero
				if(matriz[l][c] >= max) {
					max = matriz[l][c];
				}
			}
			System.out.println("");
		}
		
		//circula por toda a matriz
		for(int l = 0; l < matriz.length; l++) {
			for(int c = 0; c < matriz[l].length; c++) {
				if (matriz[l][c] == max) {
					if(tamanhoMax != "") tamanhoMax += "\n";
					tamanhoMax += "linha " + l + " coluna " + c;
				}
				if (matriz[l][c] == min) {
					if(tamanhoMin != "") tamanhoMin += "\n";
					tamanhoMin += "linha " + l + " coluna " + c;
				}
			}
		}
		
		System.out.println("\n" + "Maior número da Matriz: " + max + " na posição: " + "\n" + tamanhoMax);
		System.out.println("\n" + "Menor número da Matriz: " + min + " na posição: " + "\n" + tamanhoMin);
		
		System.out.println("\n" + "=".repeat(70));
	}

}
