// 6. Input currency in rupees and output in USD.

import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Currency in rupees : ");
        float rupees = sc.nextFloat();

        double usd = (rupees)*84.67;

        System.out.println("The Currency in USD : "+usd);

        sc.close();
    }
}