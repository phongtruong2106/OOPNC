package buoi1.srp1.nnotsrp1;

public class Tester {
    public static void main(String[] args) {
        System.out.println("hoko");
        Circle circle = new Circle(1);
        Shape[] shapes = new Shape[1];
        shapes[0] = circle;

        CalculateAreas calculateAreas = new CalculateAreas(shapes);
        calculateAreas.sumAreas();
        calculateAreas.output();
            
        
    }
}
