package revisao_02;

public class Numero {
    public Numero(float valor) {
        super();
        this.valor = valor;
    }

    private float valor;

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float calcularFatorial() {
        int cont = 1;
        int fatorial = 1;

        do {
            fatorial *= cont;
            cont++;
        } while (cont <= this.valor);

        return fatorial;
    }

    public int calcularSomatorio() {
        int soma = 0;
        int cont = 1;

        do {
            soma += cont;
            cont++;
        } while (cont <= this.valor);
        return soma;
    }

    public int contarMultiplos() {
        int contMultiplos = 0;
        int cont = 1;
        do {
            if (this.valor % cont == 0) {
                contMultiplos++;
            }
            cont++;
        } while (cont <= this.valor);
        return contMultiplos;
    }

    public String verificarSeEPrimo() {
        int contM = contarMultiplos();
        if (contM == 2) {
            return this.valor + " é PRIMO";
        } else {
            return this.valor + " é COMPOSTO";
        }
    }

}
