package buoi2.simpleduckapp.so2;

public class MallardDuck extends Duck implements FlyAble, QuackAble{

    
    @Override
    public void disPlay() {
        // TODO Auto-generated method stub
        System.out.println(" its a real duck mallard");
    }

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        System.out.println("flying....");
    }

    @Override
    public void quack() {
        // TODO Auto-generated method stub
        System.out.println("quacking.....");
    }

    @Override
    public void Swim() {
        // TODO Auto-generated method stub
        System.out.println("Its Swimming....");
    }

   
    
}
