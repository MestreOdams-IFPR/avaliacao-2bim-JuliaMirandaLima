import java.util.Scanner;

public class questao2{
        final static Scanner teclado = new Scanner(System.in);

        public static void main(String[] args) {
            final int num = 8;
            int resul = calcularTribonacci(num);
            System.out.println(resul);
            

            

        }

        // antigo : public static int calcularFibonacci(final int NUM){

        public static int calcularTribonacci(final int NUM){ // não tem esse final
            if(NUM == 0){
                return 0;
    
            } else if(NUM == 1){
                return 0;
    
            } else if( NUM == 2){
                return 1;

            }
    
            return calcularTribonacci(NUM - 1) + calcularTribonacci(NUM - 2) + calcularTribonacci(NUM-3);
    
    
        }

}