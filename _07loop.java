import java.util.Scanner;                                    

public class _07loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the term: ");
        int n = sc.nextInt();

        int i = 1;
        while(i <= n){
            System.out.println(i);
            i++;
        }

        //sum of series
        int sum = 0;
        for(i=1; i<=n; i++){
            sum = sum + i;
        }
        System.out.println("Sum of series: " + sum);

        //sum of even
        int even = 0;
        for(i=2; i<=n; i+=2){
            even = even + i;
        }
        System.out.println("even sum: " + even);
    }
}
