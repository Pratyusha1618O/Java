import java.util.*;

public class v06_vector_removeElement {
    public static void main(String[] args) {
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

        System.out.println();
        //________________________________________________

        v.removeElement("Rohit");
        
        for(int i=0; i<v.size(); i++)
        {
            System.out.print("Element at: "+ i + " is: ");
            System.out.print(v.elementAt(i)); //i'th position e j element ache 
            System.out.println();
        }

        System.out.println();

        //_________________________________________________

        v.removeElementAt(0);
        // Index 0 er element k remove kora holo
        
        for(int i=0; i<v.size(); i++)
        {
            System.out.print("Element at: "+ i + " is: ");
            System.out.print(v.elementAt(i)); //i'th position e j element ache 
            System.out.println();
        }

        //__________________________________________________

        v.removeAllElements(); // remove all elements
        System.out.println("Size of the vector: "+ v.size());
    }
}
