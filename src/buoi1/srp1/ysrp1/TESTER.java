package buoi1.srp1.ysrp1;

public class TESTER {
    public static void main(String[] args) {
        System.out.println("HELLO WORLD");
        Circle circle = new Circle(2);
        Shape[] shapesArray = new Shape[1];
        shapesArray[0] = circle;
        CalculateAreas ca = new CalculateAreas(shapesArray);
        //goi output
        OutPutAreas outPutAreas = new OutPutAreas(ca.sumAreas());

        outPutAreas.console();
        outPutAreas.HTML();

        
    }
}
