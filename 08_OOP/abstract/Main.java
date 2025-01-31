abstract class Arith{ // abstract class
    abstract void print(); // abstract method
}

class Add extends Arith{
    public void print(){
        int a = 2;
        int b = 4;
        System.out.println("Sum = "+ (a+b));
    }
}

public class Main {
    public static void main(String[] args) {
        Add a = new Add();
        a.print();
    }
}
