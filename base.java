import java.util.Scanner;
class sparent
{
	public void display()
	{
		System.out.println("Immediate parent accessed without object");
	}
}
class parent extends sparent
{
	parent()
	{
		super.display();
	}
}
public class base
{
	public static void main(String args[])
	{
		parent obj = new parent();
	}
}