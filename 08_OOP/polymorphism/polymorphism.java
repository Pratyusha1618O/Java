// We can have multiple classes where each class implements same methods and variables in different way.

interface A{
    void display();
}

class B implements A{
    public void display(){
        System.out.println("Hello");
    }

    public void num(int a){
        System.out.println(a);
    }

    public void num(int a, int b){
        System.out.println(a+b);
    }
}

public class polymorphism {
    public static void main(String[] args) {
        B b = new B();
        b.display();
        b.num(5);
        b.num(2,4);
    }
}
