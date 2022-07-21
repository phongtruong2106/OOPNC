package buoi1.ocp1.notocp;

class CalculateAreas {
    private double areas;
    public double CalculateAreas(Rectangle r){
        areas = r.length * r.width;
        return areas;
    }
}
