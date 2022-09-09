// С консоли вводятся числа, если есть повторяющиеся - print "YES", иначе print "NO"

import java.util.Arrays;
import java.util.Scanner;

public class Laba_2 {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        Scanner digit = new Scanner(System.in);
        for (int i = 0; i < myArray.length; i++ ) {
            myArray[i] = digit.nextInt();
        }
        Arrays.sort(myArray,0, myArray.length);
        String result = "NO";
        for (int i = 1; i < myArray.length; i++ ) {
            if (myArray[i] == myArray[i - 1]) {
                result = "YES";
                break;
            }
        }
        System.out.println(result);
    }

}

