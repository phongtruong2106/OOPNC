package buoi1.ocp1.notocp;

public class OpenClosed {
    public static void main(String[] args) {
         System.out.println("hello world");
         Rectangle r = new Rectangle(1, 2);
         CalculateAreas c = new CalculateAreas();
         System.out.println("AREAS = " + c.CalculateAreas(r));
    }
}
