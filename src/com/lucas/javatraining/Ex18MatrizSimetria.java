/* Exercicio
 * Verificar Simetria
 * Crie um método que verifica se uma matriz é simétrica (a[i][j] == a[j][i]).
 */

package com.lucas.javatraining;

public class Ex18MatrizSimetria {
    public static void main(String[] args) {
        
        // Declaração de variáveis
        String titulo = "Verificar Simetria de Matriz";
        
        // Matriz simétrica de exemplo
        int[][] matrizA = {
            {1, 5, 5},
            {5, 2, 6},
            {5, 6, 3}
        };
        
        // Matriz não simétrica de exemplo
        int[][] matrizB = {
            {1, 5, 5},
            {4, 2, 6},
            {5, 6, 3}
        };
        
        // Intro
        System.out.println("=".repeat(55));
        System.out.println(" ".repeat((55 - titulo.length()) / 2) + titulo.toUpperCase());
        System.out.println("=".repeat(55) + "\n");
        
        // Teste com a matriz simétrica
        if (verificaSimetria(matrizA)) {
            System.out.println("A matriz A é simétrica.");
        } else {
            System.out.println("A matriz A não é simétrica.");
        }
        
        // Teste com a matriz não simétrica
        if (verificaSimetria(matrizB)) {
            System.out.println("A matriz B é simétrica.");
        } else {
            System.out.println("A matriz B não é simétrica.");
        }
        
        System.out.println("\n" + "=".repeat(55));
    }

    //Verificador de Simetria
    public static boolean verificaSimetria(int[][] matriz) {
        // Primeiro, verifica se a matriz é quadrada
        if (matriz == null || matriz.length == 0) {
            return false;
        }
        for (int l = 0; l < matriz.length; l++) {
            if (matriz[l].length != matriz.length) return false; // Não é uma matriz quadrada
        }
        
        //for que passa pelos números da matriz l = linha, c = coluna
        for (int l = 0; l < matriz.length; l++) {
            for (int c = l; c < matriz[l].length; c++) {
            	
            	//Se encontrar um par de elementos que não são iguais, a matriz não é simétrica
                if (matriz[l][c] != matriz[c][l]) return false; 
            }
        }
        
        // Se a verificação for concluída sem encontrar diferenças, é simétrica
        return true;
    }
}