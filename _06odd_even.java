import java.util.Scanner;

public class _06odd_even {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if(n == 0){
            System.out.println("Zero");
        }
        else if(n%2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
