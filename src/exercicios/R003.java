package exercicios;

import java.util.Scanner;

/*R003 Você esta fazendo uma pesquisa entre os habitantes de uma pequena vila. Escreva um
algoritmo que colete os dados de idade, sexo (M/F) e salário de todos as pessoas que
desejam participar da pesquisa (para encerrar a entrada de dados entre a idade menor ou
igual a zero). Após coletar todos os dados informe:
a. A média de salário do grupo
b. Maior e menor idade do grupo
c. A percentagem do total de mulheres com salário até R$ 300,00
d. A quantidade de homens  */

public class R003 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int idade = Integer.MAX_VALUE, qtdePessoas = 0, maiorIdade = Integer.MIN_VALUE, menorIdade = Integer.MAX_VALUE,
                totalMulheres = 0, qtdeMulheresSalMenor = 0, totalHomens = 0;
        double salario, totalSalario = 0, mediaSalarios;
        String sexo;

        while (idade > 0) {

            System.out.print("Idade: ");
            idade = ler.nextInt();

            System.out.print("Sexo (M/F): ");
            sexo = ler.next();

            System.out.print("Salário: ");
            salario = ler.nextDouble();

            if (idade > 0) {

                qtdePessoas++;
                totalSalario += salario;

                if (idade > maiorIdade) {

                    maiorIdade = idade;

                }
                if (idade < menorIdade) {

                    menorIdade = idade;

                }
                if (sexo.compareTo("F") == 0) {

                    totalMulheres++;

                    if (salario <= 300) {

                        qtdeMulheresSalMenor++;

                    }
                } else {

                    totalHomens++;

                }
            }
        }

        mediaSalarios = totalSalario / qtdePessoas;

        System.out.printf("Média salário: %12.2f", mediaSalarios);

        System.out.printf("\nMenor idade: %d Maior idade %d", menorIdade, maiorIdade);

        if (qtdeMulheresSalMenor > 0) {
            System.out.printf("\nPerc Mulheres Sal Menor 300 = %5.2f%%",
                    ((float) qtdeMulheresSalMenor / (float) totalMulheres) * 100.0);
        }

        System.out.printf("Total homens = %d", totalHomens);

        ler.close();
    }
}
