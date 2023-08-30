package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

	//oberver pattern starts from this list
	private List<Observer> observers;
	
	private float temp;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(0);
	}

	// here the observer pattern fun works
	@Override
	public void notifyObservers() {
		//observers.forEach(o -> o.update(temp, humidity, pressure));
		observers.forEach(o -> o.update());
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(float temp,float humidity,float pressure) {
		this.humidity=humidity;
		this.temp=temp;
		this.pressure=pressure;
		measurementsChanged();
	}

	public float getTemp() {
		return temp;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
	
}
