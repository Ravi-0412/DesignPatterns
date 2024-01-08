package Factory;

public class vehicleFactory {
	
	public static vehicle getVehicle(String vehicleType) {
		vehicle Vehicle = null;
		
		if(vehicleType.equals("car")) {
			Vehicle = new car();
		}
		else if(vehicleType.equals("bike")) {
			Vehicle = new bike();
		}
		
		return Vehicle;
	}
}
