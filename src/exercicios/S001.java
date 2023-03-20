package exercicios;

import java.util.Scanner;

public class S001 {

    /*
     * S001 Criar um algoritmo que leia o valor de um produto e imprima na console
     * este valor com
     * 30% de acréscimo.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double valor, valorAcrescentado;

        System.out.print("Digite um número: ");
        valor = ler.nextDouble();

        valorAcrescentado = valor + (valor * 0.3);

        System.out.printf("%s%.2f%s%.2f", "O valor de ", valor, " com 30% de acréscimo ficará em ", valorAcrescentado);

        ler.close();
    }
}
