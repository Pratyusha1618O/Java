class sample
{
    static int i;
    sample()
    {
        ++i;
    }

    void display()
    {
        System.out.println("Number of object created: "+ i);
    }
}

public class s59_static_class_variable {
    public static void main(String[] args) {
        sample s1 = new sample();
        sample s2 = new sample();
        sample s3 = new sample();
        s2.display(); //3
        sample s4 = new sample();
        s3.display(); //4

    }
}
