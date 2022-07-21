package buoi1.dip1.separatingoutbehavior1;

public class Tester {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Bird bird = new Bird();
        System.out.println("cat making noise: " + cat.behavior.makeNoise());
        System.out.println(" dog making noise: " + dog.behavior.makeNoise());
        System.out.println("bird making noise: " + bird.makeNoise());
    }
}
