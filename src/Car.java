
public class Car {

	private String Brand;
	private int Speed;
	private String Plate;
	
	public Car(String Brand, int Speed, String Plate) {
		
		this.Brand=Brand;
		this.Speed=Speed;
		this.Plate=Plate;

	}
	
	public Car() {
		//Default Constructor	
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String Brand) {
		Brand = this.Brand;
	}

	public int getSpeed() {
		return Speed;
	}

	public void setSpeed(int Speed) {
		Speed = this.Speed;
	}

	public String getPlate() {
		return Plate;
	}

	public void setPlate(String Plate) {
		Plate = this.Plate;
	}
	
	public void calculateSpeedTicket() {

		System.out.println(Speed); 
		if(Speed< 70) 
			System.out.println(Brand +" with " + Plate + " plate goes with "+ Speed + ". There is no speed ticket."); 
		else if(Speed==70) 
			System.out.println(Brand +" with " + Plate + " plate goes with "+ Speed + ". The speed ticket is 250 coin.");
		else 
			System.out.println(Brand +" with " + Plate + " plate goes with "+ Speed + ". The speed ticket is 400 coin.");
		
	}
	
}
