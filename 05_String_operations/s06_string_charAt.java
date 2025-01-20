// kono 1ta string er kono partiular position e kon character ache seta define kore charAt()

public class s06_string_charAt {
    public static void main(String[] args) {
        String s;
        s = new String("Virat Kohli");
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            System.out.println("Character at " + i+ " is: " + c );
        }
    }
}
