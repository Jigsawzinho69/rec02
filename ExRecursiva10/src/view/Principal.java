package view;

import controller_MDC.CalculoMDC;

public class Principal {

    public static void main(String[] args) {
        int n1 = 18;
        int n2 = 28;
        int resultado = CalculoMDC.calcularMDC(n1, n2);

        System.out.println("MDC de " + n1 + " e " + n2 + ": " + resultado);
    }
}

