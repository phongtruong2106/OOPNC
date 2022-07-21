package simpleduckapp.so1.v2;

public class tester {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.Swim();
        mallardDuck.quack();
     


        Duck redHeadDuck = new ReadHeadDuck();
        redHeadDuck.Swim();
        redHeadDuck.quack();


        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.quack();
    
    }
}
