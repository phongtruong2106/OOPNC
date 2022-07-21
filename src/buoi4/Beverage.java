package buoi4;

abstract class Beverage {
   String description = "none";
  

   public abstract double Cost();


   public String getDescription() {
       return description;
   }
}
