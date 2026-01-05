Calling one constructor inside an another constructor of an immidiate parent class we use Super() Statement is called Constructor Chaining..
 super() - calls constructor of the parent class.
  this() - calls another constructor of the same class.

  Example: 
  
class Car {
	Car() {
		this("Red");
		System.out.println("Brand = " +"Yezdi Adv");
	}
	
	Car(String color)	{
		System.out.println("Color = " +color);
	}
}	

class Bike extends Car {
	Bike(int price) {
		super();
		System.out.println("Price = " +price);
	}

public static void main(String[] args) {
	Bike b = new Bike(400000);
}
}



//Output:
Color = Red
Brand = Yezdi Adv
Price = 400000
