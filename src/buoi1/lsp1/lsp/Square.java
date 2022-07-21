package buoi1.lsp1.lsp;

class Square extends Shape {

    private double side;

    public Square(double s){
        side  =s;
    }

    @Override
    public double CalcAreas() {
        areas = side*side;
        return(areas);
    }
    
}
