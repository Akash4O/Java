import java.util.*;
public class input{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student First Name : ");
        String name = sc.next(); // just takes first word as the input

        System.out.println("Enter the Student roll no :");
        int rollno = sc.nextInt();

        System.out.println("Enter Student Full Name : ");
        String FullName = sc.nextLine();

        System.out.println("Enter the Student Marks : ");
        float marks = sc.nextFloat();

        System.out.println("Student Details : ");
        System.out.println("Name : "+name);
        System.out.println("Full Name : "+FullName);
        System.out.println("Roll No : "+rollno);
        System.out.println("Student Marks : "+marks);


        sc.close();
    }
}