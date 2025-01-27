import java.util.Scanner;

class Comparison
{
    float n1,n2,greater;

    void get_data(float x, float y)
    {
        n1 = x;
        n2 = y;
    }

    float compare()
    {
        if(n1 > n2){
            return n1;
        }
        else{
            return n2;
        }
    }

    void display()
    {
        int sum = 10;
        greater = compare();
        System.out.println("Grater is: "+ greater);
        System.out.println("Result: "+ (greater + sum));
    }

}


public class s54_class_example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st no. : ");
        float a = sc.nextFloat();
        System.out.print("Enter 2nd no. : ");
        float b = sc.nextFloat();

        Comparison num = new Comparison();
        num.get_data(a, b);
        num.display();

        sc.close();
    }
}
