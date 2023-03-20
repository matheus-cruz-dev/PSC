package aula;

import javax.swing.JOptionPane;

public class Aula_09 {
    public static void main(String[] args) {

        String resposta = "sim";

        while (resposta.equals("sim")) {
            resposta = JOptionPane.showInputDialog("Deseja continuar?");
        }

    }
}
