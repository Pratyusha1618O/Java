import java.util.Scanner;

public class _04simpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principle: ");
        float p = sc.nextFloat();

        System.out.print("Enter rate: ");
        float r = sc.nextFloat();
        
        System.out.print("Enter time: ");
        float t = sc.nextFloat();

        float si = (p*r*t)/100;

        System.out.println("Simple interest = " + si);
    }
}
