package buoi1.lsp1.notlsp;

public class LiskovSubstitution {
    public static void main(String[] args) {
        System.out.println("HÊ HÊ");
        Rectangle r = new Rectangle(1, 2);
        System.out.println("AREA = " + r.CalcAreas());
        Square s = new Square(2);
        System.out.println("Areas = " + s.CalcAreas());
    }
}
