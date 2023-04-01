package aula;

public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    
    public int anoDeNasc;
    public byte numeroDeFilhos;
    public double salario;

    public int calcularIdade(int anoAtual) {
        return anoAtual - this.anoDeNasc;
    }

    Pessoa(String nome) {
        this.setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
