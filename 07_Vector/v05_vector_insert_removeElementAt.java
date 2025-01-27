import java.util.*;

public class v05_vector_insert_removeElementAt {
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

        v.insertElementAt("Bumrah", 1); 
        // index 1 e 1ta element insert holo, baki gulo porer index e sore gelo

        for(int i=0; i<v.size(); i++)
        {
            System.out.print("Element at: "+ i + " is: ");
            System.out.print(v.elementAt(i)); //i'th position e j element ache 
            System.out.println();
        }

        System.out.println();

        v.removeElementAt(0);
        // Index 0 er element k remove kora holo
        
        for(int i=0; i<v.size(); i++)
        {
            System.out.print("Element at: "+ i + " is: ");
            System.out.print(v.elementAt(i)); //i'th position e j element ache 
            System.out.println();
        }

    }
}
