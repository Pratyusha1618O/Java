import java.io.*;
public class a05_multiply10 {
    public static void main(String[] args){
        int a[] = new int[10];
        String s;

        try{
            BufferedReader BR = new BufferedReader(new InputStreamReader (System.in));

            System.out.print("Enter the term: ");
            s = BR.readLine();
            int n = Integer.parseInt(s);

            System.out.println("Enter arrray Elements: ");
            for(int i=0; i<n; i++){
                s = BR.readLine();
                a[i] = Integer.parseInt(s);
            }

            System.out.println("Multiplying 10 with each element: ");
            for(int i=0; i<n; i++){
                System.out.println(a[i] + " * 10 = " + a[i]*10);
            }

        }
        catch(Exception E){
            System.out.println("Error in input");
        }

    }
}
