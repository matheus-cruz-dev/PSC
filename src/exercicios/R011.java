package exercicios;

import java.util.Scanner;

// R011 Escreva um programa que leia um valor inteiro n, calcule e mostre a soma dos n primeiros
// números pares. Exemplo: n = 3, apresentará 2 + 4 + 6 = 12. 

public class R011 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.println("Dígite um número: ");
        num = input.nextInt();

        System.out.println("Soma dos pares = " + somaPrimos(num));

        input.close();
    }

    private static int somaPrimos(int num) {
        int soma = 0;
        int par = 2;

        while (num > 0) {
            soma += par;
            par += 2;
            num--;
        }

        return soma;
    }

}
