package exercicios;

/*C002 Leia um número inteiro e informar se ele é par ou impar */

import java.util.Scanner;

public class C002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        imprimirTexto("Dígite um número inteiro: ");
        
        verificaImPar(sc.nextInt());

        sc.close();
    }

    public static void verificaImPar(int numero) {

        numero %= 2;
        
        if (numero == 0) {
            imprimirTexto("par");
        } else {
            imprimirTexto("impar");
        }
    }

    public static void imprimirTexto(String texto) {
        System.out.print(texto);
    }


}
