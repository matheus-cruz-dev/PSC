package aula;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int idade;
        Scanner input = new Scanner(System.in);

        
        System.out.println("Dígite o seu nome: ");
        Pessoa p1 = new Pessoa(input.nextLine());
        
        System.out.println("Dígite o ano de nascimento: ");
        p1.anoDeNasc = input.nextInt();

        System.out.println("Informe o ano atual: ");
        idade = p1.calcularIdade(input.nextInt());

        System.out.println("Seu nome é: " + p1.getNome());
        System.out.println("Sua idade é: " + idade + " anos");

        input.close();
    }
}
