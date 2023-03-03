package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/
public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade;
        String nome;

        while (true){
        System.out.print("Digite o nome: ");
        nome = scan.next();
        if (nome.equals("0")){
            System.out.println("Sistema encerrado");
            break;
        }
        System.out.print("Digite a idade: ");
        idade = scan.nextInt();
        if (idade == 0){
            System.out.println("Sistema encerrado");
            break;
        }
        System.out.println("Seu nome é " + nome + " e tem "+ idade +" anos");
        }
        int num = 5, count = 1;

        while(count <= 3) {

            ++count;

            num += count;

        }

        System.out.println(num);

    }

}
