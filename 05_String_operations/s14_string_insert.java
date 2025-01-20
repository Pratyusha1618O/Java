public class s14_string_insert {
    public static void main(String[] args) {
        StringBuffer s1, s2;
        s1 = new StringBuffer("I object oriented programming");
        s2 = new StringBuffer("like ");

        s1 = s1.insert(2,s2);
        System.out.println(s1);
    }
}
