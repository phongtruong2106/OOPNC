package buoi1.srp1.nnotsrp1;

public class CalculateAreas {
    Shape[] shapes;
    double sumToTal = 0;

    public CalculateAreas(Shape[] sh){
        this.shapes = sh;
    }

    public double sumAreas(){
        sumToTal = 0;
        for(int i = 0; i < shapes.length; i++){
            sumToTal = sumToTal + shapes[i].calcAreas();
        }
        return sumToTal;
    }
    public void output(){
        System.out.println("Total of all areas = " + sumToTal);
    }
}
