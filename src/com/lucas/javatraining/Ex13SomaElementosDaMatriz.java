/* Exercicio
 * Soma de Duas Matrizes
 * Crie duas matrizes 2x2 e escreva um método separado para somá-las.
 */

package com.lucas.javatraining;

import java.util.Random;

public class Ex13SomaElementosDaMatriz {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		//declaração de variáveis
		String titulo = "Programa: Que Soma Duas Matrizes";
		int t = 2; //t = Tamanho das Matrizes
		int matrizA[][] = new int [t][t];
		int matrizB[][] = new int [t][t];
		int soma[][] = new int [t][t];
		
		//intro
		System.out.println("=".repeat(50));
		System.out.println(" ".repeat((50 - titulo.length())/2) + titulo.toUpperCase());
		System.out.println("=".repeat(50) + "\n");
		
		System.out.println("Matriz A " + t + "x" + t + ":");
		for(int l = 0; l < matrizA.length; l++) {
			for(int c = 0; c < matrizA[l].length; c++) {
				matrizA[l][c] = popula();
				mostrar(matrizA[l][c]);
			}
			System.out.println("");
		}
		
		System.out.println("\n" + "Matriz B " + t + "x" + t + ":");
		for(int l = 0; l < matrizB.length; l++) {
			for(int c = 0; c < matrizB[l].length; c++) {
				matrizB[l][c] = popula();
				mostrar(matrizB[l][c]);
			}
			System.out.println("");
		}
		
		System.out.println("\n" + "Soma Entra Matriz A e B");
		for(int l = 0; l < soma.length; l++) {
			for(int c = 0; c < soma[l].length; c++) {
				soma[l][c] = soma(matrizA[l][c],matrizB[l][c]);
				mostrar(soma[l][c]);
			}
			System.out.println("");
		}
		
		
		System.out.println("\n" + "=".repeat(50));
	}
	
	//classe para popular variavel
	public static int popula() {
		int populando = (int)(Math.random()*4);
		
		return populando; 
	}
	
	//classe para mostrar valor
	public static void mostrar(int x) {
		int mostrando = x;
		
		System.out.print(mostrando + " | ");
	}

	//classe para somar
	public static int soma(int x, int y){
		int valorSomado = x + y;
		
		return valorSomado;
	}
}
