package buoi1.dip1.dependencyinjection;

public class Tester {
    public static void main(String[] args) {
        //da hinh
        DogNoise dogNoise = new DogNoise();
        Mammal dog = new Mammal(dogNoise);
        dog.getSpeaker().makingNoise();
    }
}
