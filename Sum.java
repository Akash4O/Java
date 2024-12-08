// Program for sum of two numbers

import java.util.*;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number : ");
        int a =sc.nextInt();

        System.out.println("Enter the second number : ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("The sum of two numbers : "+sum); 

        sc.close();
    }
}