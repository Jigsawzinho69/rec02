package view;

import controller_AB.MultiplicacaoRecursiva;

// 1. Criar uma função recursiva que receba 2 valores A e B e, por somas, apresente o resultado da
//multiplicação de A por B.

public class Principal {

    public static void main(String[] args) {
        int valorA = 4;
        int valorB = 3;
        
        int resultado = MultiplicacaoRecursiva.multiplicar(valorA, valorB);

        System.out.println("Resultado da multiplicação de " + valorA + " por " + valorB + ": " + resultado);
    }
}
