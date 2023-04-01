package aula;

import java.util.Scanner;

public class Main_30_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pessoa p1 = new Pessoa(null);

        System.out.println("Dígite o seu nome: ");
        p1.setNome(input.nextLine());

        System.out.println("Dígite a sua idade: ");
        p1.setIdade(input.nextInt());
        
        System.out.println("Dígite o seu peso: ");
        p1.setPeso(input.nextDouble());

        System.out.println("**************VISUALIZANDO OS DADOS**************");
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());
        System.out.println("Peso: " + p1.getPeso());

        input.close();
    }
}
