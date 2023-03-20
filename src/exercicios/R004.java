package exercicios;

import java.util.Scanner;

/*R004 Faça um algoritmo que escreva todos os números múltiplos de 3 entre 1 e N, sendo N um
valor digitado pelo usuário. */

public class R004 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero;

        System.out.print("Dígite um valor: ");
        numero = ler.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0) {
                imprimirNumero(i);
            }
        }

        ler.close();
    }

    public static void imprimirNumero(Integer numero) {
        System.out.print(numero + " | ");
    }
}
