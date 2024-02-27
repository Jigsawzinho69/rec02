package view;

import controller_pares.ContadorParesRecursiva;

// 3. Construir uma função recursiva que receba um vetor e seu tamanho e apresente a quantidade de
//números pares existentes no vetor. Considere que a entrada deve ser, apenas de números naturais
//diferentes de zero.


public class Principal {

    public static void main(String[] args) {
        int[] vetor = {2, 5, 8, 3, 12, 15};
        int tamanho = vetor.length;

        int resultado = ContadorParesRecursiva.contarPares(vetor, tamanho);

        System.out.println("Quantidade de números pares no vetor: " + resultado);
    }
}
