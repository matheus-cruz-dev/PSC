package aula;

public class Primes {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 2; i <= 2000; i++) {
            if (ehPrimo(i)) {
                sum += i;
            }
        }
        System.out.println("Soma primos menores que 2MI = " + sum);
    }

    private static boolean ehPrimo(int num) {
        int divisor = 2;

        while (divisor < num) {
            System.out.println("Verificando " + num + " ...");
            if (num % divisor == 0) {
                return false;
            }
            divisor++;
        }
        return true;
    }
}
