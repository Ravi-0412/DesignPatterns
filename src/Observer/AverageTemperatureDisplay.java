package Observer;

// system 2

public class AverageTemperatureDisplay implements Observer{
	
	private int sumOfTemperatures;
	private int totalTemperatures;
	
	public AverageTemperatureDisplay(Observable observable) {
		// weather station needs to register this for notification.
		// so passing observable object so that can use 'registerObserver()'.
		observable.registerObserver(this);  // this: this class
		
		sumOfTemperatures = 0;
		totalTemperatures = 0;
		
	}

	@Override
	public void update(int temperature, int humidity) {
		sumOfTemperatures += temperature;
		totalTemperatures += 1 ;
		display();
	}
	
	
	private void display() {
		System.out.println("Average Temperature for the past : "+ sumOfTemperatures + "Average temp:" + ((float)sumOfTemperatures) / totalTemperatures );
	}
	

}
