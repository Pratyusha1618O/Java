// method overriding
class A{
    void display(){
        System.out.println("Hello");
    }
}

class B extends A{
    public void display(){
        System.out.println("Everyone");
    }
}

public class s68_overriding {
    public static void main(String[] args) {
        B b = new B();
        b.display(); // everyone
    }
}
