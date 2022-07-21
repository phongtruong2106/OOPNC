package buoi2.simpleduckapp.so2;

public class tester {
    public static void main(String[] args) {
        MallardDuck d =new MallardDuck();
        d.disPlay();
        d.fly();
        d.quack();
        d.Swim();


        ReadHeadDuck ra = new ReadHeadDuck();
        ra.disPlay();
        ra.quack();
        ra.Swim();

        RubberDuck rb = new RubberDuck();
        rb.disPlay();
        rb.quack();
        rb.Swim();


        DecoyDuck de = new DecoyDuck();
        de.disPlay();
        de.Swim();
    
    }
}
