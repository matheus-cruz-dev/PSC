package aula;

import java.util.Scanner;

public class MainSemaforo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Semaforo s1 = new Semaforo(null);
        
        System.out.println("Informe a cor inicial do primeiro semáforo");
        String cor = input.next();

        // System.out.println(s1.Semaforo(cor)); // exibir objeto 

        input.close();

    }
}
