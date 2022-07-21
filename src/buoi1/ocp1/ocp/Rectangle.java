package buoi1.ocp1.ocp;

class Rectangle extends Shape {

    protected double length;
    protected double width;

    public Rectangle(double l, double r){
        length = l;
        width = r;
    }
    @Override
    public double getAreas() {
       return length*width;
    }
    
}
