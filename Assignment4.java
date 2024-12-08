//4. Take in two numbers and an operator (+, -, *, /) and calculate the value.

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the First Number : ");
        a = sc.nextInt();
        System.out.println("Enter the Second Number : ");
        b = sc.nextInt();
        System.out.println("Choose the Operator : \n1. Addition. \n2. Substraction. \n3. Multiplication. \n4. Division. \nEnter the choice :");
        int op = sc.nextInt();
        if(op==1){
            System.out.println("The Addition of 2 numbers is : "+(a+b));
        }else if(op==2){
            System.out.println("The Substraction of 2 numbers is : "+(a-b));
        }else if(op==3){
            System.out.println("The Multiplication of 2 numbers is : "+(a*b));
        }else if(op==4){
            System.out.println("The Division of 2 numbers is : "+(a/b));
        }

        sc.close();
    }
}