package view;

import controller_divisao.RestoDivisaoRecursiva;

// 2. Criar uma fun��o recursiva que receba o dividendo e o divisor de uma opera��o de divis�o e, por
//subtra��es, exiba o resto da divis�o.


public class Principal {

    public static void main(String[] args) {
        int Dv = 17;
        int Dd = 5;
        
        int resultado = RestoDivisaoRecursiva.calcularRestoDivisao(Dd, Dv);

        System.out.println("Resto da divis�o de " + Dd + " por " + Dv + ": " + resultado);
    }
}

