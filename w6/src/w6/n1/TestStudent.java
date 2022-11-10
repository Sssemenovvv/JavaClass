package w6.n1;

import java.util.Random;

public class TestStudent {
    public static Student[] randArr(){
        Student[] arr = new Student[10];
        Random rand = new Random(100);
        for (int i=0; i<10; i++){
            arr[i] = new Student(rand.nextInt(100));
        }
        return arr;
    }

    public static Student[] insertionSort(Student[] arr){
        for (int i=1; i <arr.length; i++){
            Student x = arr[i];
            int j = i;
            while (j>0 && arr[j-1].getiDNumber()>x.getiDNumber()){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j]=x;
        }
        return arr;
    }

    public static void print(Student[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i].getiDNumber()+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Student[] arr = randArr();
        print(arr);
        insertionSort(arr);
        print(arr);
    }
}
