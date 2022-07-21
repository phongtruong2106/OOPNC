package buoi1.ocp1.ocp;

 class Cricle extends Shape {

    protected double radius;
    public Cricle(double r){
        radius = r;
    }
    @Override
    public double getAreas() {
        return radius*radius*3.14;
    }
    
}
