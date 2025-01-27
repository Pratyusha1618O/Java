import java.util.*;

public class v11_vector_copyInto {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.addElement("Virat");
        v.addElement("Rohit");
        v.addElement("Bumrah");
        v.addElement("Rohit");

        String vArray[] = new String[4];
        v.copyInto(vArray);
 
    }
}
