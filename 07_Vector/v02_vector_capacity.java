import java.util.*;

public class v02_vector_capacity {
    public static void main(String[] args) {
        Vector v = new Vector();
        int c = v.capacity(); // vector er default capacity 10
        System.out.println("Capacity of the vector is: "+c);

        v.ensureCapacity(50); //ensureCapacity() use kore capacity barano holo
        System.out.println("Now the capacity of vector is: "+ v.capacity());

    }
}
