package controller_divisao;

public class RestoDivisaoRecursiva {

    public static int calcularRestoDivisao(int Dd, int Dv) {
        if (Dd < Dv) {
            return Dd;
        }
        return calcularRestoDivisao(Dd - Dd, Dd);
    }
}

