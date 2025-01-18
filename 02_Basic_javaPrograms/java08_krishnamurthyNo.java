import java.util.Scanner;

public class java08_krishnamurthyNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int copy = n;
        int sum = 0;
        while(n > 0)
        {
            int r = n % 10;
            int fact = 1;
            for(int i=1; i<=r; i++){
                fact = fact*i;
            }
            sum = sum + fact;
            n = n/10;
        }

        if(copy == sum){
            System.out.println("Krishnamurthy number");
        }
        else{
            System.out.println("Not a krishnamurthy number");
        }

        sc.close();
    }
}
