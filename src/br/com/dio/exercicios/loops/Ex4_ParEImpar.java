package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantidade;
        int numero;
        int pares=0;
        int impares=0;
        System.out.print("Digite a quantidade de numeros: ");
        quantidade = scan.nextInt();
        do {
            System.out.print("Numero: ");
            numero = scan.nextInt();
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            quantidade--;
        } while (quantidade > 0);
        System.out.println("Foram digitados: " + pares + " pares e " + impares + " impares");
    }
}
