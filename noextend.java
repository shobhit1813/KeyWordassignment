import java.util.Scanner;
final class sparent
{
	//CAN NOT BE INHERITED as final
}
class parent extends sparent
{
	parent()
	{
		//Cannot subclass sparent.
		System.out.println("the parent  ")
	}
}
public class noextend
{
	public static void main(String args[])
	{
		parent obj = new parent();
	}
}