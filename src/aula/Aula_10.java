package aula;

import java.util.Scanner;

public class Aula_10 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        ler.close();

        float numero, media, soma = 0;
        int cont;

        for (cont = 0; cont < 3; cont++) {

            System.out.println("Dígite o número: ");
            numero = ler.nextFloat();

            soma += numero;
        }

        media = soma / 3;

        System.out.printf("%s%.2f", "A média é: ", media);


    }
}
