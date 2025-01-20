import java.io.*;

public class s03_string {
    public static void main(String[] args) throws IOException
    {
        String s1,s2,s3,s4;
        s1 = new String("Java");
        s2 = new String("Programming");
        s3 = "welcome to " + s1 + " " + s2;
        System.out.println(s3);
        s4 = s3;
        System.out.println(s4);
    }
}
