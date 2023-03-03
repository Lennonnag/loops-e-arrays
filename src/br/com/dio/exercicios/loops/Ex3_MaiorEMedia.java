package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double media = 0;
        double numero;
        double maior = 0;

        int contador = 0;

        do {
            System.out.print("Digite o " + (1 + contador) + "º numero: ");
            numero = scan.nextDouble();
            if (numero > maior) {
                maior = numero;
            }
            media = media + numero;
            contador++;
        } while (contador < 5);
        media = media / 5;
        System.out.println("A média é: " + media);
        System.out.println("O maior numero é: " + maior);
    }
}
