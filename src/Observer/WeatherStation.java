package Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable{
	
	private List<Observer> observers;  // list of observers he need to notify
	private int temperature;
	private int humidity;
	
	public WeatherStation() {
		this.observers = new ArrayList<>();
	}
	
	// to check whether observer is already added or not
	private boolean hasObserver(Observer observer) {
		int index = observers.indexOf(observer);
		return index >= 0;
	}
	
	// to add observer
	@Override
	public void registerObserver(Observer observer) {
		if(!hasObserver(observer))
			observers.add(observer);
	}
	

	@Override
	public void removeObserver(Observer observer) {
		if(hasObserver(observer))
			observers.remove(observers.indexOf(observer));
		
	}

	@Override
	public void notifyObserver() {
		observers.forEach(observer -> observer.update(temperature, humidity));
		
	}
	
	public void parametersChanged(int temperature, int humidity) {
		this.temperature = temperature;
		this.humidity = humidity;
		notifyObserver();  // notify observer also in case of change
	}

}
