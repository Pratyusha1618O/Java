import java.util.*;

public class v03_vector_addElement_elementAt {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        v.addElement("Virat");
        v.addElement("Rohit");
        v.addElement("Hardik");
        
        for(int i=0; i<v.size(); i++)
        {
            System.out.print("Element at: "+ i + " is: ");
            System.out.print(v.elementAt(i)); //i'th position e j element ache 
            System.out.println();
        }
    }
}
