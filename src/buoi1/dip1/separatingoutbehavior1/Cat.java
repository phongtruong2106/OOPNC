package buoi1.dip1.separatingoutbehavior1;

class Cat extends Mammal{

    CatNoise behavior = new CatNoise();
    @Override
    public String makeNoise() {
        // TODO Auto-generated method stub
        return behavior.makeNoise();
    }
    
}
