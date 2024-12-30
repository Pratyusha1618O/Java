public class s08_string_indexOf {
    public static void main(String[] args) {
        String s;
        s = new String("Gojo Satoru");
        int pos1 = s.indexOf('G');
        System.out.println("First occurance of G is : "+ pos1);
        
        int pos2 = s.indexOf('o',5); //5 no position er por theke khoja suru korbe
        System.out.println("Occurance of 'o' after position 5: "+ pos2);

    }
}
