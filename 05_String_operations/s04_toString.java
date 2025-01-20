public class s04_toString {
    public static void main(String[] args) {
        StringBuffer s1;
        String s2;
        s1 = new StringBuffer("Object oriented programming");
        s2 = new String(s1.toString());
        System.out.println(s1);
        System.out.println(s2);
    }
}
