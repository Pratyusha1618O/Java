import java.util.Scanner;

public class P03_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the term: ");
        int n = sc.nextInt();

        // normal triangle
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i ;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // Reverse triangle
        for(int i=1; i<=n; i++)
        {
            for(int j=i; j<=n ;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
