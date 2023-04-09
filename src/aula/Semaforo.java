package aula;

public class Semaforo {
    private String cor;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Semaforo(String cor) {
        this.cor = cor;
    }

    public void sinalizarAtencao() {
        this.cor = "Amarelo";
    }

    public void sinalizarPare() {
        this.cor = "Vermelho";
    }

    public void sinalizarSiga() {
        this.cor = "Verde";
    }

    @Override
    public String toString() {
        return "O semaforo está sinanalizando " + this.cor;
    }

    
}
