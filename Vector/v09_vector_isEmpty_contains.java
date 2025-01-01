import java.util.*;

public class v09_vector_isEmpty_contains {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.addElement("Virat");
        v.addElement("Rohit");
        v.addElement("Bumrah");

        boolean b = v.isEmpty();
        System.out.println(b);
        if(b == false){
            System.out.println("List is not empty");
        }

        b = v.contains("Rohit");
        if(b==true){
            System.out.println("The vector contains Rohit");
        }else{
            System.out.println("Does not contain");
        }
    }
}
