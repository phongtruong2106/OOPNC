package buoi1.srp1.ysrp1;

public class OutPutAreas {
    double areas = 0;
    public OutPutAreas(double a){
        this.areas = a;

    }
    public void console(){
        System.out.println("TOTAL OF ALL AREAS = " +areas);
    }

    //day ra html

    public void HTML(){
        System.out.println("<HTML>");
        System.out.println("TOTAL OF ALL AREAS = " + areas);
        System.out.println("</HTML>");
    }
}
