// 3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Principal Amount : ");
        float p = sc.nextFloat();

        System.out.println("Enter the Time period in Years : ");
        float t = sc.nextFloat();

        System.out.println("Enter the Interest Rate : ");
        float r = sc.nextFloat();

        float Si = (p*t*r)/100;

        System.out.println("The Simple Interest is : "+Si);

        sc.close();
    }
}