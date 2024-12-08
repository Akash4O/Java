// 1. Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println("The "+num+" is a Even Number.");
        }else{
            System.out.println("The "+num+" is a Odd Number.");
        }


        sc.close();
    }
}