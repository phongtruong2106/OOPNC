package buoi4;

public class Tester {
public static void main(String[] args) {
    Beverage beverage = new Espresso();
    System.out.println(beverage.getDescription() + " $ " + beverage.Cost()) ;
    Beverage beverage2 = new DarkRoast();
    beverage2 = new Milk(beverage2);
    beverage2 = new Soyy(beverage2);
    beverage2 = new Mocha(beverage2);
    beverage2 = new Whip(beverage2);
    System.out.println(beverage2.getDescription() + " & " + beverage2.Cost());

    Beverage beverage3 = new Decaf();
    beverage3 = new Milk(beverage3);
    System.out.println(beverage3.getDescription() + " & " + beverage3.Cost());



}
}
