package buoi1.ocp1.ocp;

class CalculateAreas {
    private double area;

    public double CalcAreas(Shape s){
        area = s.getAreas();
        return area;
    }
}
