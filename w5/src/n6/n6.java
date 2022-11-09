package n6;

import java.util.Scanner;

public class n6 {
    public static String isSimple1(int dividMin,int dividMax, int n){
        if (dividMin<dividMax && n%dividMin!=0){
            return isSimple1(dividMin+1,dividMax,n);
        }
        if (n%dividMin==0) return "NO";
        return "YES";
    }

    public static String isSimple(int n){
        return isSimple1(2,(int)Math.sqrt(n),n);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = in.nextInt();
        if (n>2) {
            System.out.println(isSimple(n));
        }
        else{
            System.out.print("Введено некоректное число!");
        }
    }
}
