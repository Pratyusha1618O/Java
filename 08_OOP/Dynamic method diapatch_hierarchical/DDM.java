// DYNAMIC METHOD DISPATCH

class A{
    void m1(){
        System.out.println("m1 A");
    }
}

class B extends A{ // hierarchical inheritance
    void m1(){     // dynamic method dispatch
        System.out.println("m1 B");
    }
}

class C extends A{
    void m1(){
        System.out.println("m1 C");
    }
}

public class DDM {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        a.m1();
        b.m1();
        c.m1();

        // A ref;
        // ref = a;
        // ref.m1();

        // ref = b;
        // ref.m1();

        // ref = c;
        // ref.m1();
    }
}
