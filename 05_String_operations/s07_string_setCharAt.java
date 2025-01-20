public class s07_string_setCharAt {
    public static void main(String[] args) {
        StringBuffer s;
        //StringBuffer change kora jay pore, string change kora jayna
        s = new StringBuffer("Virat Kohli");
        s.setCharAt(5, '_');
        System.out.println(s);
    }
    
}