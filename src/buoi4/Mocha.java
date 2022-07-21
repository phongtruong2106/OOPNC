package buoi4;

public class Mocha extends ComdimentDecorator {


    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return beverage.getDescription() + ", mocha";
    }

    @Override
    public double Cost() {
        // TODO Auto-generated method stub
        return beverage.Cost() + .20;
    }
    
}
