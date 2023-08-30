package ObserverPattern;

public class WeatherStation {
	public static void main(String args[]) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		//weatherData.setMeasurements(10, 20, 30);
		weatherData.setMeasurements(10, 20, 30);
	}
}
