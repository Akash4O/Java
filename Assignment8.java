// 8. To find out whether the given String is Palindrome or not.

import java.util.Scanner;



public class Assignment8 {

    public static boolean Palindrome(String s1){
        
        int start =0;
        int end = s1.length()-1;
        while (start<end) {
            if (s1.charAt(start)!=s1.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the String to Check Palindrome : ");
        String s1 = sc.next();

        boolean flag = Palindrome(s1);
        if(flag == true){
            System.out.println("The String is Palindrome !");
        }else{
            System.out.println("The String is not Palindrome !");
        }


        sc.close();
    }
}