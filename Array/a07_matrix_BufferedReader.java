import java.io.*;

public class a07_matrix_BufferedReader {
    public static void main(String[] args) {
        int a[][] = new int [10][10];
        int i,j,row,col;
        String s;

        try {
            BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the row:");
            s = BR.readLine();
            row = Integer.parseInt(s);

            System.out.print("Enter the column: ");
            s = BR.readLine();
            col = Integer.parseInt(s);

            System.out.println("Enter array elements: ");
            for(i=0; i<row; i++){
                for(j=0; j<col; j++)
                {
                    System.out.printf("a[%d][%d] = ", i,j);
                    s = BR.readLine();
                    a[i][j] = Integer.parseInt(s);
                }
            }

            System.out.println("Printing: ");
            for(i=0; i<row; i++){
                for(j=0; j<col; j++)
                {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }

        } catch (Exception e) {
            System.out.println("error in input");
        }
    }
}
