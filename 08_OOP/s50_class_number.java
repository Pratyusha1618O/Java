class number{
    int a;
    int b;
    int c;

    void add(int num1, int num2){
        a = num1;
        b = num2;
        c = num1+num2;
  
    }

    void print(){
        System.out.println("Result = "+ c);
    }
}

public class s50_class_number {
    public static void main(String[] args) {
        number n = new number();
        n.add(10,20);
        n.print();
    }
}
