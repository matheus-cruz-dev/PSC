package revisao_02;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;

        do {

            System.out.println("Informe um numero positivo: ");
            numero = input.nextInt();
            if (numero < 0) {
                System.out.println("Digite um numero positivo, arrombado!");
            }

        } while (numero < 0);

        Numero n1 = new Numero(numero);
        int escolha;

        do {
            System.out.println("1 - Visualizar o número digitado: ");
            System.out.println("2 - Alterar número: ");
            System.out.println("3 - Visualizar o fatorial do número: ");
            System.out.println("4 - Visualizar o somatório do número: ");
            System.out.println("5 - Visualizar a quantidade de múltiplos: ");
            System.out.println("6 - Ver se é número primo: ");
            System.out.println("0 - Sair");
            System.out.print("-> ");
            escolha = input.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("Número digitado " + n1.getValor());
                    break;
                case 2:
                    int novoNumero;
                    do {
                        System.out.println("Informe o novo número: ");
                        novoNumero = input.nextInt();
                        if (novoNumero < 0) {
                            System.out.println("Informe um número positivo, arrombado!");
                        }
                    } while (novoNumero < 0);
                    n1.setValor(novoNumero);
                    System.out.println("Número alterado com sucesso!");
                    break;
                case 3:
                    float fatorial = n1.calcularFatorial();
                    System.out.println("O fatorial é " + fatorial);
                    break;
                case 4:
                    Integer somatorio = n1.calcularSomatorio();
                    System.out.println("O somatório é " + somatorio);
                    break;
                case 5:
                    Integer multiplos = n1.contarMultiplos();
                    System.out.println("A quantidade de múltiplos é " + multiplos);
                    break;
                case 6:
                    String ePrimo = n1.verificarSeEPrimo();
                    System.out.println("O número " + ePrimo);
                    break;
            }
        } while (escolha != 0);

        input.close();
    }
}
