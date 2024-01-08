package Observer;

public class Driver {
	
	private static void delay() {
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// 1st create weather station
		WeatherStation weatherStation = new WeatherStation();
		
		// now create observers
		CurrentWeatherConditionsDisplay currentWeatherConditionsDisplay = new CurrentWeatherConditionsDisplay(weatherStation);
		AverageTemperatureDisplay averageTemperatureDisplay = new AverageTemperatureDisplay(weatherStation);
		
		weatherStation.parametersChanged(20, 10);
		
		delay();
		
		weatherStation.parametersChanged(10, 30);
		
		delay();
		
		weatherStation.parametersChanged(50, 60);
		
		
	}
	
	}

