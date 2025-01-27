import java.io.IOException;
import java.util.Vector;

public class v04_vector_set_get {
    public static void main(String[] args) throws IOException {
        Vector v = new Vector();
        v.addElement("Virat");
        v.addElement("Rohit");
        v.addElement("Hardik");
        
        for(int i=0; i<v.size(); i++)
        {
            System.out.print("Element at: "+ i + " is: ");
            System.out.print(v.elementAt(i)); //i'th position e j element ache 
            System.out.println();
        }

        v.set(2,"Bumrah"); // set the value of a particular position
        System.out.println("Now element at index 2: ");
        System.out.print(v.get(2)); // get the value of a particular position

        
    }
}
