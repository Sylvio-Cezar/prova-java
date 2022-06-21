package br.edu.univas;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("---------------------------");
        System.out.println("Digite um número:");
        int numero = scan.nextInt();

        if (numero % 5 == 0) {
            System.out.println(numero + " --> " + numero);
            System.out.println("---------------------------");
        }
        else if ((numero + 1) % 5 == 0) {
            System.out.println(numero + " --> " + (numero + 1));
            System.out.println("---------------------------");
        }
        else if ((numero + 2) % 5 == 0) {
            System.out.println(numero + " --> " + (numero + 2));
            System.out.println("---------------------------");
        }
        else {
            System.out.println(numero + " --> " + numero);
            System.out.println("---------------------------");
        }
    }
}
