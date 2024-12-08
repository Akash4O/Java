import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Celsius Value : ");
        float tempC = sc.nextFloat();
        float tempF = (tempC*9/5)+32;
        System.out.println("The Fahrenheit value of "+tempC+" is : "+tempF);
        sc.close();
    }
}