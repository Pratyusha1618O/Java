import java.util.Scanner;

public class decimal_to_binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Decimal: ");
        int decimal = sc.nextInt();

        int ans = 0; // binary answer
        int pw = 1; //power of 10

        while(decimal > 0)
        {
            int parity = decimal % 2;
            ans += (parity * pw);
            pw *= 10;
            decimal = decimal / 2;
        }

        System.out.print("Binary: "+ ans);

        sc.close();
    }
}
