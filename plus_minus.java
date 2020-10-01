package HackerRank-Solutions;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class plus_minus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int counter_positive = 0;
        int counter_negative = 0;
        int counter_zero = 0;
        float positive, negative, zero;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                counter_positive += 1;
            } else if (arr[i] < 0) {
                counter_negative += 1;
            } else {
                counter_zero += 1;
            }
        }
        positive = (float) counter_positive / arr.length;
        negative = (float) counter_negative / arr.length;
        zero = (float) counter_zero / arr.length;
        System.out.println(positive);
        System.out.println(negative);
        System.out.println(zero);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
