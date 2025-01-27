class sample
{
    public static int i=5;
    static int method1()
    {
        System.out.println("Value of i in method1: "+ i);
        return 0;
    }

    static int method2()
    {
        System.out.println("Value of i in method2: "+ i);
        return 0;
    }
}

public class s60_static_method {
    public static void main(String[] args) {
        // direct sample.method() call kora jay
        sample.method1();
        sample.method2();

        // Object baniye o kora jay
        sample s = new sample();
        s.method1();
        s.method2();
    }
}
