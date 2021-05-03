
public class Program1 {
	
	int a=5;

	public void getData()
	{
		System.out.println("I m method");
	}
	
	public static void main(String args[])
	{
		System.out.println("Hellow World--I'm main program");
		
		Program1 p1 = new Program1();
		p1.getData();
		System.out.println("Variable of class ==>" + p1.a);
		Program2 p2 = new Program2();
		p2.setData();
	}
	
}
