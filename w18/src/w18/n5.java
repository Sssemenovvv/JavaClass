package w18;

public class n5 {
    public static long factorial(long number){
        if ((number < 0)&(number>20)){
            System.out.println("Число должно быть положительное!!");
            return -1;
        }
        long fact = 1;
        for (long i=2; i<=number; i++){
            fact*=i;
        }
        return fact;
    }

    public static void testFact7(long number){
        System.out.print("факториал числа 5: ");
        if (number == 5040){
            System.out.println("Метод работает верно, результат: "+number);
            return;
        }
        System.out.println("Метод работает неверно, результат: "+number);
    }


    public static void main(String[] args) {
        testFact7(factorial(7));
    }
}
