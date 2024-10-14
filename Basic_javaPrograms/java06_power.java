import java.util.Scanner;

public class java06_power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        System.out.print("Enter the power: ");
        int b = sc.nextInt();

        int ans = 1;
        for(int i=1; i<=b; i++)
        {
            ans *= a;
        }

        System.out.println("Result = "+ ans);

        sc.close();
    }
}
