// 2. Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name : ");
        String name = sc.nextLine();

        System.out.println("Hello, "+name+"!");

        sc.close();
    }
}