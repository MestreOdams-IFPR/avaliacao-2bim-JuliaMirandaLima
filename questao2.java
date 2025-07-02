import java.util.Scanner;

public class questao2{
        final static Scanner teclado = new Scanner(System.in);

        public static void main(String[] args) {
            final int num = 8;
            int resul = calcularFibonacci(num);
            System.out.println(resul);
            

            

        }

        public static int calcularFibonacci(final int NUM){
            if(NUM == 0){
                return 0;
    
            } else if(NUM == 1){
                return 0;
    
            } else if( NUM == 2){
                return 1;

            }
    
            return calcularFibonacci(NUM - 1) + calcularFibonacci(NUM - 2) + calcularFibonacci(NUM-3);
    
    
        }

}