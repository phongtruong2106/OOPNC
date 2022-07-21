package buoi2.simpleduckapp.so1.v2;

public abstract class Duck {
    public void quack(){
        System.out.println("quack noise");
    }
    public void Swim(){
        System.out.println("Swimming....");
    }

    public void fly(){
        System.out.println("flying....");
    }

    public abstract void disPlay();
}
