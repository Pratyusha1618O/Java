import java.util.Vector;

public class v07_vector_remove_clear {
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

        v.remove("Rohit");
        v.remove(1);
        
        for(int i=0; i<v.size(); i++)
        {
            System.out.print("Element at: "+ i + " is: ");
            System.out.print(v.elementAt(i)); //i'th position e j element ache 
            System.out.println();
        }

        System.out.println();

        v.clear();
        System.out.println(v.size());
      
    }
}
