class Student
{
    float m1, m2, tutorial;
    float total, gtotal;

    float get_data(float x, float y)
    {
        m1 = x;
        m2 = y;
        total = m1 + m2;
        return total;
    }

    void display()
    {
        tutorial = 10;
        total = tutorial + get_data(50, 20);

        System.out.println("Total: "+ total);
        
    }

}

public class s54_class_return {
    public static void main(String[] args) {
        Student s = new Student();

        s.display(); 
    }
}
