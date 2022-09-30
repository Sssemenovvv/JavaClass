package w18;

import static java.lang.System.out;

public class n1 {
    public static void main(String[] args){
        int[] arr = {1, 2,5,6,8,13,154,143,33,24,65,456};

        int sum1 = 0;
        for (int i=0; i< arr.length; i++){
            sum1+=arr[i];
        }

        int sum2 = 0;
        int i=0;
        while (i< arr.length){
            sum2+=arr[i];
            i++;
        }

        int sum3 = 0;
        i=0;
        do {
            sum3+=arr[i];
            i++;
        } while(i< arr.length);

        out.println("Сумма массива первым способом = "+sum1);
        out.println("Сумма массива вторым способом = "+sum2);
        out.println("Сумма массива третьим способом = "+sum3);

    }
}
