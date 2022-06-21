package br.edu.univas;
import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] resultados = new int[20];
        int vitorias = 0;
        int derrotas = 0;
        int empates = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("----------------------------------------------------");
            System.out.println("\t Digite o resultado da " + (i + 1) + "ª partida: \n (-1 para derrota, 0 para empate e 1 para vitória)");
            resultados[i] = scan.nextInt();

            if (resultados[i] == -1) {
                derrotas++;
            }
            else if (resultados[i] == 1) {
                vitorias++;
            }
            else if (resultados[i] == 0) {
                empates++;
            }
            else {
                System.out.println("Valor inválido!!!");
            }
        }
        System.out.println("----------------------------------------------------");

        System.out.println(" ");
        System.out.println("Atenção: somente valores válidos foram considerados");
        System.out.println("---------------------------");
        System.out.println("Quantidade de vitórias: " + vitorias);
        System.out.println("Quantidade de empates: " + empates);
        System.out.println("Quantidade de derrotas: " + derrotas);
        System.out.println("---------------------------");
    }
}
