import java.util.Scanner;

public class ConditionalStatemets {
    public static void main(String[] args) {
        // Find the largeest of the 3 integers


        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = 0;
        // if (a>b) {
        //     max=a;
        // }else{
        //     max=b;
        // }

        // if(c>max){
        //     max=c;
        // }

        //OR

        max = Math.max(c,Math.max(a, b));


        System.out.println(max);
        sc.close();


    }
}