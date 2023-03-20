package aula;

public class MetodoSemRetorno {
    public static void main(String[] args) {
        imprimir();
        imprimirTexto("Vítor");
    }

    public static void imprimirTexto(String texto) {
        System.out.println(texto);
    }

    public static void imprimir() {
        System.out.println("Apresentando professor Vítor Careca!");
    }
}
