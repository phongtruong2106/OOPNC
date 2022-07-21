package buoi3.wweatherso3;

public class WeatherStationHeatIndex {
    public static void main(String[] args) {
         WeatherData weatherData = new WeatherData();
         CurrentConditionsDislplay currentConditionsDislplay = new CurrentConditionsDislplay(weatherData);
         StatisticsDisPlay statisticsDisPlay = new StatisticsDisPlay(weatherData);
         ForeCastDisplay foreCastDisplay = new ForeCastDisplay(weatherData);
         HeatIndexDisPplay heatIndexDisPplay = new HeatIndexDisPplay(weatherData);

         weatherData.setMeasurements(80, 65, 30.4f);
         weatherData.setMeasurements(82, 70, 29.2f);
         weatherData.setMeasurements(78, 90, 29.2f);
    }
}
