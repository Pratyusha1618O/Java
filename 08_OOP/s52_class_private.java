//Accessing Private Members

class Student
{
    int roll; 
    String name = new String(); // wrapper class
    float marks;
    //variables gulor age public mention nao kora jete pare 
    //Friendly 

    private void get_data()
    {
        roll = 10;
        name = "Raj";
        marks = 75.5f;
    }

    void display()
    {
        get_data();
        System.out.println("Roll: "+ roll);
        System.out.println("Name: "+ name);
    }

}

public class s52_class_private {
    public static void main(String[] args) {
        Student s = new Student();
        // s.get_data(); 
        // get data function private. tai ekhane access kora jabe na
        // sekhetre get_data() ke onno function er moddhe call kore nite hobe jeta private noy
        
        s.display(); 
    }
}

