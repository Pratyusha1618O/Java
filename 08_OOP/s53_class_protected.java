//Accessing Protected Members

class Student
{
    protected int roll;
    protected String name = new String(); // wrapper class
    protected float marks;

    protected void get_data()
    {
        roll = 10;
        name = "Raj";
        marks = 75.5f;
    }

    protected void display()
    {
        // get_data(); 

        System.out.println("Roll: "+ roll);
        System.out.println("Name: "+ name);
    }

}

public class s53_class_protected {
    public static void main(String[] args) {
        Student s = new Student();
        s.get_data(); 
        // Protected er khetre access kora jay,,
        // Same class er moddheo different class er moddheo
        // jader k permission deoa hbe tara access korte parbe

        s.display(); 
    }
}
