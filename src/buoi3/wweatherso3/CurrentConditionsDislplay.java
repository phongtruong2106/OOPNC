package buoi3.wweatherso3;

import java.util.Observable;
import java.util.Observer;


public class CurrentConditionsDislplay implements  Observer ,DisplayElement{

    Observable observable;
    private float temperature;
    private float humidity;


    public CurrentConditionsDislplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        // TODO Auto-generated method stub
        if(obs instanceof WeatherData){
            WeatherData weatherData = (WeatherData)obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("Current conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity");
    }
    
}
