import java.util.Vector;

public class v08_vector_first_lastElement {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        v.addElement("Virat");
        v.addElement("Rohit");
        v.addElement("Dravid");
        v.addElement("Bumrah");
        v.addElement("Hardik");

        System.out.println(v);

        System.out.println("First element of the vector is: "+ v.firstElement());
        System.out.println("Last element of the vector is: "+ v.lastElement());

    }
}
