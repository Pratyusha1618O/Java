// Nesting of Object

class student
{
    private int roll;
    String name = new String();

    void get_data(){
        roll = 10;
        name = "Raj";
    }

    void display()
    {
        System.out.println("Inside student class....");
        System.out.println("Roll: "+ roll);
        System.out.println("Name: "+ name);
    }
}

class result 
{
    float marks;
    student s = new student();

    void get_data()
    {
        s.get_data(); // student class er moddhe er get_data func theke data neoa hocche
        marks = 80.5f;
    }

    void display()
    {
        s.display();
        System.out.println("Marks: "+ marks);
    }

}

public class s56_nesting_object {
    public static void main(String[] args) {
        result r = new result();
        r.get_data(); // result class er get_data() call
        r.display();

    }
}
