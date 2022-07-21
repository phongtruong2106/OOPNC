package buoi4;

public class Soyy extends ComdimentDecorator {

    public Soyy(Beverage beverage){
        this.beverage = beverage;

    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return beverage.getDescription() + ", soy";
    }

    @Override
    public double Cost() {
        // TODO Auto-generated method stub
        return beverage.Cost() + .20;
    }
    
}
