package aula;

public class Numero {
    private int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String verificarNumero() {
        // Se o valor for dividido por 2 e der resto 0 e for maior que 0 o número será par positivo
        if (this.valor % 2 == 0 && this.valor > 0) {
            return "PAR POSITIVO";
        } else if (this.valor % 2 == 0 && this.valor < 0) {
            return "PAR NEGATIVO";
        } else if (this.valor % 2 != 0 && this.valor > 0) {
            return "IMPAR POSITIVO";
        } else if (this.valor % 2 != 0 && this.valor < 0) {
            return "IMPAR NEGATIVO";
        } else {
            return "NULO";
        }
    }
}
