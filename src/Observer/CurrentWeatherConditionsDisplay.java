package Observer;

// system 1

public class CurrentWeatherConditionsDisplay implements Observer{
	
	private int temperature;
	private int humidity;
	
	public CurrentWeatherConditionsDisplay(Observable observable) {
		// weather station needs to register this for notification.
		// so passing observable object so that can use 'registerObserver()'.
		observable.registerObserver(this);  // this: this class
	}

	@Override
	public void update(int temperature, int humidity) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	
	
	private void display() {
		System.out.println("Current Weather condition : Temperature : " + temperature + ", Humidity: "+ humidity);
	}
	

}
