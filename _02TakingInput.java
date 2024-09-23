import java.util.Scanner;

public class _02TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Line Input
        System.out.print("Enter a line:");
        String str = sc.nextLine();
        System.out.println("The Line is: " + str);
        
        //Integer Input
        System.out.print("Enter number: ");
        int num1 = sc.nextInt();
        System.out.println("The number is: " + num1);

        //Word Input
        System.out.print("Enter a string (word):");
        String name = sc.next();
        System.out.println("The string is : " + name);

        

    }
}
