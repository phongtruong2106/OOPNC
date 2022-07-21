package buoi1.dip1.initialexample1;

public class Test {
    public static void main(String[] args) {
        System.out.println("hello people");

        Cat cat = new Cat();
        System.out.println("meo making noice " + cat.makeNoice());
        Dog dog = new Dog();
        System.out.println("Dog making noice " + dog.makeNoice() );
    }
}
