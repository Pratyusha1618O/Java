class sample
{
    int a;
    sample(int x) 
    {
        a = x; 
    }

    sample change() // method er moddhe object pathano // reference
    {
        sample s = new sample(a*2);
        return (s);
    }

    
}


public class s58_object_method_returnType {
    public static void main(String[] args) {
        sample a1 = new sample(10);
        sample a2;
        a2 = a1.change();
        System.out.println(a1.a); //10
        System.out.println(a2.a); //20
    }
}
