package aula;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Data d1 = new Data();
        
        System.out.println("Informe o dia: ");
        d1.setDia(input.nextInt());
        
        System.out.println("Informe o mês: ");
        d1.setMes(input.nextInt());
        
        System.out.println("Informe o ano: ");
        d1.setAno(input.nextInt());

        System.out.println("**************VISUALIZANDO OS DADOS**************");
        System.out.println(d1);

        input.close();

    }
}
