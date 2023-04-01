package aula;

import javax.swing.JOptionPane;

public class Exemplo_Vetor_06 {
    public static void main(String[] args) {

        float[] vetor = new float[10];
        float media, soma = 0;
        String num;

        for (int i = 0; i < vetor.length; i++) {
            num = JOptionPane.showInputDialog("Dígite o valor " + i + ":");
            vetor[i] = Float.parseFloat(num);
            soma += vetor[i];
        }
        media = soma/vetor.length;
        JOptionPane.showMessageDialog(null, "Média: " + media);

    }
}
