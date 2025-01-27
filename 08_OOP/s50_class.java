class human{
    int neuron1;
    int neuron2;

    void listen(int a, int b)
    {
        neuron1 = a;
        neuron2 = b;
    }

    void speak()
    {
        System.out.println("Your 1st value is: "+neuron1);
        System.out.println("Your 2nd value is: "+neuron2);
    }
}

public class s50_class {
    public static void main(String[] args) {
        human Virat = new human();
        Virat.listen(10,20);
        Virat.speak();

        human Rohit = new human();
        Rohit.listen(4,8);
        Rohit.speak();
    }
}
