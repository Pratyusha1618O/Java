// import java.io.*;

public class a06_matrix {
    public static void main(String[] args) {
        int a[][] = new int[3][3];
        a[0][0] = 10;
        a[0][1] = 20;
        a[0][2] = 30;
        // and so on

        int b[][] = {{10,20,30}, {40,50,60}, {70,80,90}};

        int i,j;
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
