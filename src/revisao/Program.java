package revisao;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Numero n1 = new Numero();

        System.out.println("Digite um numero: ");
        n1.setValor(input.nextInt());

        System.out.println("O numero escolhido foi " + n1.getValor() + ", seu fatorial é " + n1.calcularFatorial(0));

        input.close();

    }
}
