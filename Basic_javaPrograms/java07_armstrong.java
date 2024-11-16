import java.util.Scanner;

public class java07_armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int copy = n;
        int digit_count = 0;
        while(n>0)
        {
            n = n / 10;
            digit_count++;
        }

        // System.out.println("digits: "+ digit_count);
        n = copy;

        int sum = 0;
        while(n>0)
        {
            sum += Math.pow(n%10, digit_count);
            n = n / 10;
        }

        if(copy == sum ){
            System.out.println("The number is Armstrong Number");
        }
        else{
            System.out.println("The number is Not Armstrong Number");
        }
        sc.close();
    }
}
