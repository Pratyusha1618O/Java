import java.util.Scanner;
public class a08_matrix_addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[10][10];
        int b[][] = new int[10][10];
        int i,j,row,col;
        System.out.print("Enter rows: ");
        row = sc.nextInt();
        System.out.print("Enter columns: ");
        col = sc.nextInt();

        System.out.println("Enter 1st array elements: ");
        for(i=0; i<row; i++){
            for(j=0; j<col; j++){
                System.out.printf("a[%d][%d] = ", i,j);
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter 2nd array elements: ");
        for(i=0; i<row; i++){
            for(j=0; j<col; j++){
                System.out.printf("b[%d][%d] = ", i,j);
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("Adding 2 matrices: ");
        for(i=0; i<row; i++){
            for(j=0; j<col; j++){
                System.out.print(a[i][j] + b[i][j] + " ");
            }
            System.out.println();
        }



    }
}
