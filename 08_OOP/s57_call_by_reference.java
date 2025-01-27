//  Call By Reference

import java.io.IOException;

class sample
{
    int a,b;
    // constructor method // class er nijer name e function desig korle
    sample(int x, int y) 
    {
        a = x;
        b = y;
    }

    void changeValue(sample s) // method er moddhe object pathano // reference
    {
        s.a = s.a/2;
        s.b = s.b/2;
    }

    void display()
    {
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}

public class s57_call_by_reference {
    public static void main(String[] args) throws IOException {
        sample r = new sample(10,20);
        System.out.println("Before calling methods: ");
        r.display();

        System.out.println("After calling methods: ");
        r.changeValue(r);
        r.display();
        
    }
}
