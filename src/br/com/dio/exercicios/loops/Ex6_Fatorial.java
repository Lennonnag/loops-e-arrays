package br.com.dio.exercicios.loops;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/
public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int fatorial = 1;
        System.out.print("Digite o numero que deseja saber o fatorial: ");
        numero = scan.nextInt();
        for (int x = numero; x >= 1; x--) {
            fatorial = fatorial * x;
        }
        System.out.println(numero + "! = " + fatorial);
    }
}