package buoi1.lsp1.lsp;

class Rectangle extends Shape {

    private double length;
    private double width;
    
    public Rectangle(double l, double w){
        length = l;
        width = w;
    }

    @Override
    public double CalcAreas() {
       areas = length *width;
       return(areas);
    }
    
}
