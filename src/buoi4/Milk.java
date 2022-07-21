package buoi4;

public class Milk extends ComdimentDecorator{

    
    
    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return beverage.getDescription() + ", MIlk";
    }

    @Override
    public double Cost() {
        // TODO Auto-generated method stub
        return beverage.Cost() + .23;
    }
    
}
