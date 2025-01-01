public class s37_string_append {
    public static void main(String[] args) {
        String s1;
        s1 = new String("Object Oriented Programming");
        StringBuffer s2;
        s2 = new StringBuffer("Welcome to ");
        s1 = s2.append(s1).toString(); //s2 StringBuffer // 
        System.out.println(s1);
    }
}
