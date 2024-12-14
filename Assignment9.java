// 9. To find Armstrong Number between two given number.

import java.util.Scanner;

public class Assignment9 {

    public static boolean Armstrong(int num){
        int originalNum = num;
        int sum = 0;

        int size = String.valueOf(num).length();

        while(num>0){
            int digit = num %10;
            sum = (int) (sum + Math.pow(digit, size));
            num = num / 10;
        }

        return sum == originalNum;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num = sc.nextInt();
        if (Armstrong(num)) {
            System.out.println(num+"Is an Armstrong Number.");
        }else{
            System.out.println(num+"Is not an Armstrong Number.");
        }
        sc.close();
    }
}