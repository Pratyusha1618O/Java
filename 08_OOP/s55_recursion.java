class factorial
{
    int result;

    int fact(int n)
    {
        if(n<=0){
            return 1;
        }else{
            result = n * fact(n-1);
            return result;
        }
    }
}

public class s55_recursion {
    public static void main(String[] args) {
        factorial f = new factorial();
        System.out.println("Result: "+ f.fact(4));
    }
}
