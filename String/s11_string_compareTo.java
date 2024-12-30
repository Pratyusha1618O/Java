// The Java compareTo() method compares the given string with the current string lexicographically. 
// It returns a positive number, a negative number, or 0. 
// It compares strings based on the Unicode value of each character in the strings.

public class s11_string_compareTo {
    public static void main(String[] args) {
        String s1, s2;
        s1 = new String("Gojo Satoru");
        s2 = new String("Yuta Okkotsu");

        int a = s1.compareTo(s2);
        System.out.println(a);
        if(a==0){
            System.out.println(s1 + " and " + s2 + " are lexicographically equal.");
        }
        else if(a>0){
            System.out.println(s1 + " comes after " + s2 + " lexicographically.");
        }
        else{
            System.out.println(s1 + " comes before " + s2 + " lexicographically.");
        }
    }
}
