package inheritance;

public class MyVehicle {

	public static void main(String[] args) {
		
		BMW myBMW = new BMW();
		myBMW.applyBrake();
		myBMW.changeColor();
		
		Bajaj bj = new Bajaj();
		bj.applyBrake();
	}

}
