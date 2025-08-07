/* Exercício
 * Rotação de Matriz 90 Graus
 * Dada uma matriz 3x3, escreva um método que a rotacione 90 graus para a direita.
 */

package com.lucas.javatraining;

import java.util.Random;

public class Ex14Giro90gMatriz {

	public static void main(String[] args) {

		Random r = new Random();

		//Declaração de variáveis
		String titulo = "Programa: Gira uma Matriz 90 Graus Para Direita";
		int t = 4; // tamanho da matriz
		int matriz[][] = new int [t][t];
		int matriz90g[][] = new int [t][t];
		
		//Intro
		System.out.println("=".repeat(50));
		System.out.println(" ".repeat((50 - titulo.length())/2) + titulo);
		System.out.println("=".repeat(50) + "\n");
		
		
		System.out.println("Matriz " + t + "x" + t + ":");
		for(int l = 0; l < matriz.length; l++) {
			for(int c = 0; c < matriz[l].length; c++) {
				matriz[l][c] = (int)(Math.random()*10); //Popula matriz com valor aleatório
				System.out.print(l + ";" + c + ": " + matriz[l][c] + " | ");
			}
			System.out.println("");
		}
				
		for(int l = 0; l < matriz90g.length; l++) {
			for(int c = 0; c < matriz90g[l].length; c++) {
				matriz90g[c][matriz90g.length - l -1] = matriz[l][c];
			}
		}
		
		System.out.println("\n" + "Matriz 90g Para Direita " + t + "x" + t + ":");
		for(int l = 0; l < matriz90g.length; l++) {
			for(int c = 0; c < matriz90g[l].length; c++) {
				System.out.print(l + ";" + c + ": " + matriz90g[l][c] + " | ");
			}
			System.out.println("");
		}
		
		
		System.out.println("\n" + "=".repeat(50));
	}

}
