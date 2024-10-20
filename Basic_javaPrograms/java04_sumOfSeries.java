//  s = 1-2+3-4..........
// ans += odd
// ans -+ even

import java.util.Scanner;

public class java04_sumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the term: ");
        int n = sc.nextInt();

        int ans = 0;
        for(int i=1; i<=n; i++)
        {
            if(i%2 != 0){
                ans += i;
            }
            else{
                ans -= i;
            }
        }

        System.out.println("Result of the series: "+ ans);

        sc.close();
    }
}
