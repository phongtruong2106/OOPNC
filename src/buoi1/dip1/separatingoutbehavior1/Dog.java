package buoi1.dip1.separatingoutbehavior1;

 class Dog extends Mammal{

    DogNoise behavior = new DogNoise();

    @Override
    public String makeNoise() {
        // TODO Auto-generated method stub
        return behavior.makeNoise();
    }
    
}
