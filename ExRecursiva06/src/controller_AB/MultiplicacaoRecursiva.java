package controller_AB;

public class MultiplicacaoRecursiva {

    public static int multiplicar(int a, int b) {
        // Condi��o de parada: retorna 0 quando B � igual a 0
        if (b == 0) {
            return 0;
        }
        // Rela��o de chamada: multiplicar(a, b) = a + multiplicar(a, b-1)
        return a + multiplicar(a, b - 1);
    }
}


