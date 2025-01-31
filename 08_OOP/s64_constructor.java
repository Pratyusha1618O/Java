// Constructor
class Student{
    int roll;
    // public Student(){ //default constructor
    //     roll = 2;
    //     System.out.println(roll);
    // }

    public Student(int r){ //parameterized constructor
        roll = r;
        System.out.println(roll);
    }

}


public class s64_constructor {
    public static void main(String[] args) {
        // Student s = new Student();
        Student s = new Student(2);
    }
}
