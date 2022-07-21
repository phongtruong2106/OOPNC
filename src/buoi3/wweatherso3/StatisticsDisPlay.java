package buoi3.wweatherso3;

import java.util.Observable;
import java.util.Observer;

import javax.crypto.Mac;

public class StatisticsDisPlay implements Observer, DisplayElement{
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;


    private int numReadings;

    public StatisticsDisPlay(Observable observable){
        observable.addObserver(this);
    }

    

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("AVG/max/ MIn Temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
    }

    @Override
    public void update(Observable o, Object arg) {
        // TODO Auto-generated method stub
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData)o;
            float temp = weatherData.getTemperature();
            tempSum += temp;
            numReadings++;

            if(temp >  maxTemp){
                maxTemp = temp;
            }
            if(temp < minTemp){
                minTemp = temp;
            }

            display();

        }
    }
}
