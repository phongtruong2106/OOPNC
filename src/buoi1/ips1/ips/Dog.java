package buoi1.ips1.ips;

class Dog implements IEat, IMakeNoice{

    @Override
    public void makeNoice() {
        System.out.println("Dog is Making noICE");
        
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
        
    }
    
}
