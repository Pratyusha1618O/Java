import java.util.Scanner;

public class java02_sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int copy = n;
        int sum = 0;

        while(n > 0)
        {
            sum += n % 10;
            n = n / 10;
        }

        System.out.println("Sum of the digits in "+ copy +": "+ sum);

        sc.close();
    }
}
