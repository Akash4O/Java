import java.util.Scanner;

public class NTimesInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked : ");
        int n1 = sc.nextInt();
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int count=0;
        while (n > 0) {
            int temp = n%10;
            n = n/10;
            if(temp==n1){
                count++;
            }
        }

        System.out.println("The number of "+n1+" in this : "+count);

        sc.close();
    }
}
