//5. Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        int n1 = sc.nextInt();
        System.out.println("Enter the Second Number : ");
        int n2 = sc.nextInt();
        if (n1>n2) {
            System.out.println("The largest number is : "+n1);
        }else{
            System.out.println("The largest number is : "+n2);
        }
        sc.close();
    }
}