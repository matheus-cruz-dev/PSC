package exercicios;

import java.util.Scanner;

public class S002 {

    /*
     * S002 Desenvolver um programa que leia dos valores e mostre o resto da divisão
     * do primeiro valor digitado pelo segundo e também a exponenciação do segundo pelo primeiro
     * valor lido.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double primeiroValor, segundoValor, exponenciação, resto;

        System.out.print("Dígite o primeiro valor: ");
        primeiroValor = ler.nextDouble();

        System.out.print("Dígite o segundo valor: ");
        segundoValor = ler.nextDouble();

        resto = (double) primeiroValor % segundoValor;
        exponenciação = (double) primeiroValor * (segundoValor * segundoValor);

        System.out.printf("%s%.2f%s%.2f", "O resto da divisão vai ser ", resto, " e o valor da exponênciação vai ser ", exponenciação);

        ler.close();
    }
}
