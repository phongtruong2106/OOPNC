package buoi1.srp1.nnotsrp1;

public class Circle extends Shape{
    private double radius;

    public Circle(double r){
        radius = r;
    }
    @Override
    public double calcAreas() {
        areas = 3.14*(radius*radius);
        return (areas);
    }
    
}
