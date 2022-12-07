package w27;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static <E> List<E> convert(E[] arr){
        return Arrays.asList(arr);
    }

    public static void main(String[] args) {
        String[] arr = new String[]{
                "Smth1",
                "Smth2",
                "Smth3",
                "Smth4"
        };
        Integer[] arr2 = new Integer[]{ 1,32,4,4,32,1,1,2};
        System.out.println(convert(arr));
        System.out.println(convert(arr2));
    }
}