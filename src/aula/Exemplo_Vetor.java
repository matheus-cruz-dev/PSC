package aula;

import java.util.Arrays;
import java.util.Scanner;

public class Exemplo_Vetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] numeros = new int[6];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digíte um número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(numeros));

        sc.close();
    }
}
