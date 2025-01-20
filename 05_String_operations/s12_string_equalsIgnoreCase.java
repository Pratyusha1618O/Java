public class s12_string_equalsIgnoreCase {
    public static void main(String[] args) {
        String s1, s2;
        s1 = new String("Gojo Satoru");
        s2 = new String("GOJO SATORU");

        boolean a = s1.equalsIgnoreCase(s2);
        System.out.println(a);
        if(a=true){
            System.out.println("Both are equal");
        }
        else{
            System.out.println("Not equal");
        }
        
    }
}
