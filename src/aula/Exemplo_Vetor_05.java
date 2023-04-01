package aula;

import java.util.Arrays;
import java.util.Scanner;

public class Exemplo_Vetor_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] pares = {0, 2, 4, 6, 8};

        System.out.println("Números pares: ");

        System.out.println(Arrays.toString(pares));
        System.out.println("O Array contém " + pares.length + " elementos.");

        sc.close();
    }
}
