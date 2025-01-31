//onek gulo class 1ta class ke inherit korbe

class Animal{
    void eat(){
        System.out.println("Eating");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal{
    void mew(){
        System.out.println("Cat is mewing");
    }
}

public class hierarchical_inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();

        Cat c = new Cat();
        c.eat();
        c.mew();
    }
}
