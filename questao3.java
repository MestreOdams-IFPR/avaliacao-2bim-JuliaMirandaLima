import java.util.Scanner;

public class questao3 {
    final static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        final int NUMPELL = 7;
        int resultado = calcularPell(NUMPELL);
        System.out.println(resultado);
    }

    public static int calcularPell(final int NUMPELL) { // não tem o final
        if (NUMPELL == 0) {
            return 0;
        } else if (NUMPELL == 1) {
            return 1;

        }
        return 2 * calcularPell(NUMPELL - 1) + calcularPell(NUMPELL - 2);

    }

}
