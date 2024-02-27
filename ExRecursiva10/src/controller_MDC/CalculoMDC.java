package controller_MDC;

public class CalculoMDC {

    public static int calcularMDC(int x, int y) {
        if (x == y) {
            return x;
        } if (x > y) {
            return calcularMDC(x - y, y);
        }
        	return calcularMDC(y, x);
    }
}
