package br.edu.univas;

public class Questao01 {
    public static void main(String[] args) {
        int menorValor = 0;

        for (int i = 1;; i ++) {
            if(i % 11 == 0 && i % 13 == 0 && i % 17 == 0) {
                menorValor = i;
                break;
            }
        }

        System.out.println("------------------------------------------------");
        System.out.println("O menor número divisível por 11, 13 e 17 é: " + menorValor);
        System.out.println("------------------------------------------------");
    }
}
