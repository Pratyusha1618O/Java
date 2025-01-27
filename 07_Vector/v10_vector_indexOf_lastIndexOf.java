import java.util.*;

public class v10_vector_indexOf_lastIndexOf {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.addElement("Virat");
        v.addElement("Rohit");
        v.addElement("Bumrah");
        v.addElement("Rohit");


        int b = v.indexOf("Rohit");
        System.out.println("First index of Rohit: "+b);
        b = v.lastIndexOf("Rohit");
        System.out.println("Last index of Rohit: "+b);

       
    }

}
