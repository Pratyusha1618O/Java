import java.util.Scanner;

public class _05readChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //reading single character
        System.out.print("Enter a character");
        char ch = sc.next().charAt(0);
        System.out.println("Character is: "+ ch);
    }
}
