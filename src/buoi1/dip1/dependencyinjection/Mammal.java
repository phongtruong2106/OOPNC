package buoi1.dip1.dependencyinjection;
 class Mammal {
        private MakeNoise speaker;

    //Contructor injection
    public Mammal(MakeNoise na){
        this.speaker = na;
    }


    public MakeNoise getSpeaker() {
        return speaker;
    }
}
