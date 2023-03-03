package br.com.dio.exercicios.arrays;

import java.util.Scanner;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetor = {1,2,3,4,5,6};
        int contador = vetor.length - 1;
        System.out.print("Vetor inverso: ");
        while(contador >= 0){
            System.out.print(vetor[contador] + " ");
            contador--;
        }
        System.out.print("\n\nVetor inicial: ");
        for (int x : vetor){
            System.out.print(x + " ");
        }

    }
}
