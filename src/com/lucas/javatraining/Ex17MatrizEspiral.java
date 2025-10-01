/* Exercicio
 * Matriz Espiral
 * Gere uma matriz 3x3 preenchida em ordem espiral.
 */

package com.lucas.javatraining;

import java.util.Random;

public class Ex17MatrizEspiral {
	public static void main(String[] args) {
		
		Random r = new Random();
		
		//Declaração de variáveis
		String titulo = "Matriz Espiral";
		int t = 5; // tamanho matriz
		int mEspiral [][] = new int[t][t]; 
		
		//introdução
		System.out.println("=".repeat(50));
		System.out.println(" ".repeat((50 - titulo.length())/2) + titulo.toUpperCase());
		System.out.println("=".repeat(50) + "\n");
		
		//preenchimento da matriz espiral
		System.out.println("Preenchimento Espiral: ");
		for(int l = 0; l < mEspiral.length; l++) {
			if(l % 2 != 0) { //se a linha for impar, a regra muda
				for(int c = mEspiral[l].length-1; -1 < c; c--) { //-1 corrige um erro do tamanho da matriz e é escalável caso t (tamanho matriz) mude
					mEspiral[l][c] = (int)(Math.random()*10);
					System.out.print("l" + l + "; c" + c + " = " + mEspiral[l][c] + " | "); //print teste
				}
			} else {
				for(int c = 0; c < mEspiral[l].length; c++) {
					mEspiral[l][c] = (int)(Math.random()*10);
					System.out.print("l" + l + "; c" + c + " = " + mEspiral[l][c]  + " | "); //print teste
				}
			}
			System.out.println(); //print teste
		}
		
		//Exibição da matriz:
		System.out.println("\n" + "Exibição Normal da Matriz: ");
		for(int l = 0; l < mEspiral.length;l++) {
			for(int c = 0; c < mEspiral[l].length;c++) {
				System.out.print(mEspiral[l][c] + " | ");
			}
			System.out.println();
		}
		
		System.out.println("\n" + "=".repeat(50));
	}
}