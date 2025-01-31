
class Sample{
    int x;
    String n;
    Sample()
    {
        System.out.println("Constructor called");
        finalize();
    }

    public void finalize(){
        System.out.println("FInalize called");
    }
}

public class s66_finalize {
   public static void main(String[] args) {
    Sample s = new Sample();
    // System.gc();
    // System.runFinalization();
   }
}
