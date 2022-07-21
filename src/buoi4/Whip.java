package buoi4;

public class Whip extends ComdimentDecorator{


    Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage  = beverage;
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double Cost() {
        // TODO Auto-generated method stub
        return beverage.Cost() + .23;
    }
    
}
