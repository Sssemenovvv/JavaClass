package w26;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try{
            int i = Integer.parseInt(intString); System.out.println( 2 / i );
        } catch (NumberFormatException e){
            System.out.println(e);
        }
        /*Задание 3
        catch (Exception e) {
            System.out.println(e);
        }*/
        /*Задание 4
        finally {   <= Задание 4
            System.out.println("Finally");
        }*/

    }
}
