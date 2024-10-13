import java.util.Scanner;

public class java01_countDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int noOfDigits = 0;
        int copy = n;

        while(n>0)
        {
            n = n/10;
            noOfDigits++;
        }

        System.out.println("Number of digits in " + copy + ": " + noOfDigits);

        sc.close();
    }
    
}
