import java.util.Scanner;
public class a04_arr_scanner {
    public static void main(String[] args) {
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements: ");
        n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter array elements: ");
        for(i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.println("Printing them: ");
        for(i=0; i<n; i++){
            System.out.print("\t " + a[i]);
        }

        sc.close();
    }
    
}
