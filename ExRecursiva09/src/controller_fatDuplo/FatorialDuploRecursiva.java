package controller_fatDuplo;

public class FatorialDuploRecursiva {

    public static int calcularFatorialDuplo(int n) {

        if (n <= 1) {
            return 1;
        }
        	return n * calcularFatorialDuplo(n - 2);
    }

    public static int validarEObterFatorialDuplo(int n) {

        if (n % 2 == 0) {
            System.out.println("Erro: O número deve ser ímpar para calcular o fatorial duplo.");
            return -1;
        }
        return calcularFatorialDuplo(n);
    }
}

