import java.util.Scanner;

public class java05_1stNfactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the term: ");
        int n = sc.nextInt();

        int fact = 1;
        System.out.println("Printing first n factorial numbers: ");
        for(int i=1; i<=n; i++)
        {
            fact = fact*i;
            System.out.println(i +"! = "+fact);
        }

        sc.close();
    }
}
