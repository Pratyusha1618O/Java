// Array of objects

class Student{
    int roll;
    String name;
    double mark;
    Student(int r, String n, double m){ //constructor
        roll = r;
        name = n;
        mark = m;
    }

    void display()
    {
        System.out.println(roll + name + mark);
    }
}


public class s63_array_of_objects {
    public static void main(String[] args) {
        Student s[] = new Student[10];
        s[0] = new Student(1, " Pro ", 95.5);
        s[1] = new Student(2, " Raj ", 96);
        // s[0].display();
        for(int i=0; i<2; i++){
            s[i].display();
        }
    }
}
