class student
{
   final int roll = 101; // Value ta finally set kore deoa hocche ,, r change kora jabena
   protected String name;
   protected float marks;
   
   void get_data()
   {
        // roll = 201; //Final variable can not be changed
        name = "Raj";
        marks = 85.5f;
   }

   void display()
   {
    System.out.println("Roll: "+ roll);
    System.out.println("Name: "+ name);
    System.out.println("Marks: "+marks);
   }
}

public class s61_final_var_method_class {
    public static void main(String[] args) {
        student s = new student();
        System.out.println("Roll: " + s.roll);
        s.get_data();
        s.display();
    }
}
