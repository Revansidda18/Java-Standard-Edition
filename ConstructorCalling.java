Calling one constructor inside an another constructor within the same class we use call to this() statement.

Example:

public class Student
{
	Student(String name) 
{
		System.out.println("Name = " +name);
  }
	
	Student(int marks)
{
		this("Revan");
		System.out.println("Marks = " +marks);
	}

	Student(long mobNo)
{
		this(50);
		System.out.println("MobNo = " +mobNo);
	}

	public static void main(String[] args) 
{
		Student s = new Student(9876543210l);	
	}
}

//Output
Name = Revan
Marks = 50
MobNo = 9876543210
