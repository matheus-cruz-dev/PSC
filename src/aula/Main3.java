package aula;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Numero n1 = new Numero();

        System.out.println("Dígite um valor: ");
        n1.setValor(input.nextInt());

        System.out.println("**************VISUALIZANDO OS DADOS**************");
        System.out.println("O valor é um " + n1.verificarNumero());

        input.close();
    }
}
