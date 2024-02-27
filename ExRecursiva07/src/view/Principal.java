package view;

import controller_divisao.RestoDivisaoRecursiva;

// 2. Criar uma função recursiva que receba o dividendo e o divisor de uma operação de divisão e, por
//subtrações, exiba o resto da divisão.


public class Principal {

    public static void main(String[] args) {
        int Dv = 17;
        int Dd = 5;
        
        int resultado = RestoDivisaoRecursiva.calcularRestoDivisao(Dd, Dv);

        System.out.println("Resto da divisão de " + Dd + " por " + Dv + ": " + resultado);
    }
}

