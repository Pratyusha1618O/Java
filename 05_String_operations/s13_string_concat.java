public class s13_string_concat {
    public static void main(String[] args) {
        String s1, s2;
        s1 = new String("Virat Kohli");
        s2 = new String(" is a player");

        s1 = s1.concat(s2);
        System.out.println(s1);
    }
}
