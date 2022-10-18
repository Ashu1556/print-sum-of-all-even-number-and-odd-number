// Programming of even number sum and odd number sum 

import java.util.*;

public class Class {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        scan.close();
        int evensum = 0;
        int oddsum = 0;

        for (int i = 0; i < n; i++) {
            int v = arr[i];
            if (v % 2 == 0) {
                evensum = evensum + v;
            } else {
                oddsum = oddsum + v;
            }

        }
        System.out.println("evensum are  equal to " + evensum);
        System.out.println("oddsum are equal to " + oddsum);
        int sum = evensum + oddsum;
        System.out.println("Sum of difference between evensum and oddsum " + sum);
    }

}
