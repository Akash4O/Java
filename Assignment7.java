// 7. To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int n1 = sc.nextInt();
        int a=0,b=1;
        for (int i = 0; i < n1; i++) {
            System.out.print(a+" ");
            int nextTerm = a+b;
            a = b;
            b = nextTerm;
        }

        sc.close();
    }
}