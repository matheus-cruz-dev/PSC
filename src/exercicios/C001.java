package exercicios;

import java.util.Scanner;

/*C001 Faça um algoritmo que leia dois valores numéricos e efetue a multiplicação entre eles,
caso o resultado deve ser apresentado caso seja maior que o primeiro valor lido ao
quadrado */

public class C001 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int priNumero, segNumero, resultado1, resultado2;

        imprimirTexto("Dígite um valor: ");
        priNumero = ler.nextInt();

        imprimirTexto("Dígite outro valor: ");
        segNumero = ler.nextInt();

        resultado1 = multiplica(priNumero, segNumero);
        resultado2 = quadrado(priNumero);

        verifica(resultado1, resultado2);

        imprimirTexto("O resultado da multiplicação é :" + resultado1);
        imprimirTexto("O resultado do quadrado do primeiro valor é : " + resultado2);
        
        ler.close();
    }

    public static void imprimirTexto(String texto) {
        System.out.println(texto);
    }

    public static int multiplica(int num1, int num2) {
        return num1 * num2;
    }

    public static int quadrado(int priNumero) {
        return priNumero * priNumero;
    }

    public static void verifica(int resultado1, int resultado2) {
        if (resultado1 < resultado2) {
            System.out.println(resultado1);;
        }
    }
}