package view;

import controller_fatDuplo.FatorialDuploRecursiva;

public class Principal {

    public static void main(String[] args) {
        int numeroImpar = 5;
        int resultado = FatorialDuploRecursiva.validarEObterFatorialDuplo(numeroImpar);

        if (resultado != -1) {
            System.out.println("Fatorial duplo de " + numeroImpar + ": " + resultado);
        }
    }
}


