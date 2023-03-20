package exercicios;

import java.util.Arrays;
import java.util.Scanner;

/*M013 Ler um vetor A de 3 números. 
Após, ler mais um número e guardar em uma variável X.
Armazenar em um vetor M o resultado de cada elemento de A multiplicado pelo valor X.
Logo após, imprimir o vetor M. */

public class M013 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] numeros = new int[3];

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Número [%d]: ", i);
            
            numeros[i] = ler.nextInt();
        }

        System.out.println(Arrays.toString(numeros));

        System.out.print("Número de referência: ");
        int numero = ler.nextInt();

        if (estaContido(numero, numeros)) {
            System.out.println("Eureka! Achei o número");
        } else {
            System.out.println("Não Achei o número");
        }

        ler.close();

    }

    private static boolean estaContido(int numero, int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            if (numero == numeros[i]) {
                return true;
            }
        }
        return false;
    }
}