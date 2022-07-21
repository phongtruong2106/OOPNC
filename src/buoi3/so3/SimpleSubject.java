package buoi3.so3;

import java.util.Observable;

public class SimpleSubject extends Observable{
    
    private int value = 0;
    public SimpleSubject(){}

    public void setValue(){
        this.value = value;
        setChanged();
        notifyObservers(value);
    }

    public int getValue() {
        return this.value;
    }
}
