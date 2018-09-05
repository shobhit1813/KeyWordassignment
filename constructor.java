import java.util.Scanner;

class parent
{
	parent()
	{
		System.out.println("In default constructor through parameterized one");
	}
	parent(int a)
	{
		this();
	}
}
public class constructor
{
	public static void main(String args[])
	{
		parent obj = new parent(5);
	}
}