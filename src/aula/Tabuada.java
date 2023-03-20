package aula;

public class Tabuada {
    public static void main(String[] args) {
        int tabuada[][] = new int[10][10];

        for (int i = 0; i < 10; i++) {
            if (i == 0) {
             System.out.println("");
             for (int j = 0; j < tabuada.length; j++) {
                System.out.printf("%4d", i);
             }   
            }
            for (int j = 0; j < 10; j++) {
                if(j == 0) {
                    System.out.printf("%4d", j);
                }
                tabuada[i][j] = (i + 1) * (j + 1);
                System.out.printf("%4d", tabuada[i][j]);
            }
            System.out.println();
        }
    }
}
