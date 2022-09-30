package w18;

import java.util.Arrays;
import java.util.Random;

public class n4 {
    public static int[] randArr(int numberOfElem, int maxRange){
        Random rand = new Random();
        int[] newArr = new int[numberOfElem];
        for (int i=0; i<numberOfElem; i++){
            newArr[i] = rand.nextInt(maxRange);
        }
        return newArr;
    }
    public static void printArr(int[] array){
        System.out.print("Элементы массива: ");
        for (int elem: array){
            System.out.print(elem + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array = randArr(10, 100);
        printArr(array);
        Arrays.sort(array);
        printArr(array);
    }
}
