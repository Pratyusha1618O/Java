import java.io.*;
class a03_arr_BufferedReader{
    public static void main(String[] args) {
        int a[] = new int[10];
        String s;
        try{
            BufferedReader BR = new BufferedReader(new InputStreamReader (System.in));

            System.out.print("Enter the term: ");
            s = BR.readLine();
            int n = Integer.parseInt(s);
            
            System.out.println("Enter Array elements: ");
            for(int i=0; i<n; i++){
                s = BR.readLine();
                a[i] = Integer.parseInt(s);
            }

            for(int i=0; i<n; i++){
                System.out.print("\t" + a[i]);
            }
    
        }
        

        catch(Exception E){
            System.out.println("Error in input");
        }

        
        
    }
}