public class _01variables{
    public static void main(String[] args) {
        System.out.println("Hello JAVA");
        // System.out.println(args[0]);

        int money = 2000;
        System.out.println(money);

        String name = "Tithi";
        System.out.println(name);

        boolean flag = true;
        int a = 12345;      // -2^32 to 2^31-1 //4byte
        short s = 1200;     //-32768 to 32767  //2 byte
        byte b = 120;       //-128 to 127      //1byte
        long l = 82578304;  // -2^63 to 2^63-1 //8byte
        float f = 800.3528f; // 4byte
        double d = 7878.7245; // 8byte
        char ch = 'P'; // 2byte

        System.out.println("The boolean valiable is: " + flag);
        System.out.println("The integer valiable is: " + a);
        System.out.println("The short valiable is: " + s);
        System.out.println("The byte valiable is: " + b);
        System.out.println("The long valiable is: " + l);
        System.out.println("The float valiable is: " + f);
        System.out.println("The double valiable is: " + d);
        System.out.println("The char valiable is: " + ch);

    }
}