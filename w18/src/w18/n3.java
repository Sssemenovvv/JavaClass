package w18;

import static java.lang.System.out;

public class n3 {
    public static void main(String[] args) {
        double sum = 0;
        for (int i=1; i<=10; i++){
            sum+= 1.0/i;
        }
        out.println("Сумма первых 10 чисел гармонического ряда = "+sum);
    }
}
