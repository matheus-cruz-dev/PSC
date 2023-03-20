package aula;

public class MetodoComRetorno {
    public static void main(String[] args) {
        System.out.println(MetodoComRetorno.somar(10, 5));        
        System.out.println(MetodoComRetorno.mostrarPares(100));
    }

    public static double somar(double a, double b) {
        return a + b;
    }

    public static String mostrarPares(int valor) {
        String retorno = "";

        for (int i = 0; i <= valor; i += 2) {
            retorno += i + "\n";
        }


        return retorno;
    }
}
