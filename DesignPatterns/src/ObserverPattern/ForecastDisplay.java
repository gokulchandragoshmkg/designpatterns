package ObserverPattern;

public class ForecastDisplay implements Observer,DisplayElement{

	private float temp;
	private float humidity;
	private float pressure;
	private WeatherData weatherData;
	
	public ForecastDisplay(WeatherData weatherData) {
		weatherData.registerObserver(this);
		this.weatherData = weatherData;
	}

	@Override
	public void display() {
		System.out.println("ForecastDisplay [temp=" + temp + ", humidity=" + humidity + ", pressure=" + pressure
				+ "]");
	}

	/*
	 * @Override public void update(float temp, float humidity, float pressure) {
	 * this.temp=temp; this.humidity = humidity; this.pressure=pressure; display();
	 * }
	 */
	public void update() {
		this.temp=weatherData.getTemp();
		this.humidity = weatherData.getHumidity();
		this.pressure=weatherData.getPressure();
		display();
	}
}
