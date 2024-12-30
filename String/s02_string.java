import java.io.*;

public class s02_string {
    public static void main(String[] args) throws IOException {
        char s;
        System.out.println("Enter your characters (Q for quit): ");
        do{
            s = (char)System.in.read();
            // System.out.print(s);
        }while(s != 'Q');
   
    }
}
