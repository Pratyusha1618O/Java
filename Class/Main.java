class Student{
    int rollNo;
    String Name;
}

public class Main {
    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.rollNo = 1;
        obj1.Name = "Tithi";
        System.out.println(obj1.rollNo);
        System.out.println(obj1.Name);

        Student obj2 = new Student();
        obj2.rollNo = 2;
        obj2.Name = "Deep";
        System.out.println(obj2.rollNo);
        System.out.println(obj2.Name);
    }
}
