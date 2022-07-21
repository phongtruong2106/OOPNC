package buoi1.lsp1.lsp;

public class LiskovSubstitution {
    public static void main(String[] args) {
        System.out.println("haha");
        Rectangle r = new Rectangle(1, 2);
        System.out.println("Area = " + r.CalcAreas());

        Square s = new Square(2);
        System.out.println("Area = " + s.CalcAreas());
    }
}
