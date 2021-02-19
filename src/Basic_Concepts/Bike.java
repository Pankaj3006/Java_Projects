package Basic_Concepts;

class Bike implements Vehicle {

	int speed = 30;

	public void speedUp(int increment)
	{
		speed = speed + increment;
		System.out.println(speed);
	}

	public void applyBrakes(int decrement)
	{
		speed = speed - decrement;
		System.out.println(speed);
	}

	public static void main(String[] args)
	{
		Bike bi = new Bike();
		bi.speedUp(10);
		bi.applyBrakes(20);
	}
}
