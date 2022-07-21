package buoi1.ips1.notips;

class Dog implements IMammal{


    @Override
    public void eat() {
       System.out.println("dog is eating ");
    }

    @Override
    public void makeNoice() {
        System.out.println(" dog is making noice");
        
    }
    
}
