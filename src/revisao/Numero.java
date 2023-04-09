package revisao;

public class Numero {
    private float valor;

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float calcularFatorial(float numero) {
        int cont = 1;
        int fatorial = 1;
        while (cont <= this.valor) {
            fatorial *= cont;
            cont++;
        }
        return fatorial;
    }
}
