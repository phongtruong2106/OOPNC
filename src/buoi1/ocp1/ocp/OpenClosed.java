package buoi1.ocp1.ocp;

public class OpenClosed {
    public static void main(String[] args) {
        System.out.println("hello World");
        CalculateAreas ca = new CalculateAreas();
        Rectangle r = new Rectangle(2, 3);
        System.out.println("AREA = " + ca.CalcAreas(r));
        Cricle cricle = new Cricle(2);
        System.out.println(" AREA = " + ca.CalcAreas(cricle));
    }
}
