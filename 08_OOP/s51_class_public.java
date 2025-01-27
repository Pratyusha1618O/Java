//Accessing Public Members

class Student
{
    public int roll;
    public String name = new String(); // wrapper class
    public float marks;

    public void get_data()
    {
        roll = 10;
        name = "Raj";
        marks = 75.5f;
    }

    void display()
    {
        System.out.println("Roll: "+ roll);
        System.out.println("Name: "+ name);
    }

}

public class s51_class_public {
    public static void main(String[] args) {
        Student s = new Student();
        s.get_data(); // get data te gie data gulo pabo

        //get data function er moddhe na likhe ekhaneo lekha jay jehetu public members
        // s.roll = 101;
        // s.name = "Raj"; 

        s.display(); // display them
    }
}
