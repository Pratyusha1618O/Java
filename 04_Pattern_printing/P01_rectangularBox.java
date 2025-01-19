import java.util.Scanner;

public class P01_rectangularBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the term: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n ;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
