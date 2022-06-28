package br.dio.exercicios.arrays;

//import

import java.util.Random;

public class Arraysmulti {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] M = new int[4][4]; //declara matrix 4x4

        for(int i = 0; i < M.length; i++) {
            for( int j = 0; j < M[i].length; j++) {
                M[i][j] = random.nextInt(9);
            }
        }
    }
    for( int[] linha: M ) {
        for (int elementoColuna : linha ) {
            System.out.println(elementoColuna);
        }
    }
}
