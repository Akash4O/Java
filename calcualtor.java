import java.util.Scanner;

public class calcualtor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the operator : ");
            char op = sc.next().trim().charAt(0);
            if (op=='+' || op=='-' || op=='*' || op=='/' || op=='%') {
                System.out.println("Enter 2 numbers : ");
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                System.out.println("The result is : ");
                if (op=='+') {
                    System.out.println(n1+n2);
                }else if (op=='-') {
                    System.out.println(n1-n2);
                }else if (op=='*') {
                    System.out.println(n1*n2);
                }else if (op=='/') {
                    if (n2!=0) {
                        System.out.println(n1/n2);    
                    }else{
                        System.out.println("Can't divide by 0");
                    }
                }else if (op=='%') {
                    if (n2!=0) {
                        System.out.println(n1%n2);    
                    }else{
                        System.out.println("Can't divide by 0");
                    }
                }
            }else if(op=='x' || op=='X'){
                break;
            }else{
                System.out.println("Invalid Operation !");
            }
        }
        sc.close();
        
    }
}
