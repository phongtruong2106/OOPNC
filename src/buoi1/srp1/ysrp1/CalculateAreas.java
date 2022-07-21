package buoi1.srp1.ysrp1;

class CalculateAreas {
    Shape[] shapes;
    double sumToTal = 0;
    public CalculateAreas(Shape[] sh){
        this.shapes = sh;
    }

    public double sumAreas(){
        sumToTal =0;
        for(int i = 0; i< shapes.length; i++){
            sumToTal= sumToTal + shapes[i].calcAreas();
        }
        return sumToTal;
    }
}
