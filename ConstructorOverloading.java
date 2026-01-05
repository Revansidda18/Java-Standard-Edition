Developing multiple constructors within same class called Constructor Overloading..

Rules:
Number of Arguments Should differ.
Position of Arguments Should differ.
Type of Arguments Should differ.

  Example;
public class Car
{
	Car()
	{
		System.out.println("Brand = " +"Range Rover");
	}
	
	Car(String color)
	{
		System.out.println("Color = " +color);
	}
	Car(int price)
	{
		System.out.println("Price = " +price);
	}
	
	public static void main(String [] args) {
		Car c = new Car();
		Car c1 = new Car("Black");
		Car c2 = new Car(1000000);
	}
}

//Output:
Brand = Range Rover
Color = Black
Price = 1000000
