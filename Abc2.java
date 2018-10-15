class Xyz
{
	Xyz(int b)
	{
		System.out.println(b);
	}
	void show()
	{
		System.out.println("Check");
	}
}
class Abc2 extends Xyz 
{
	int b;
	Abc2(int b)
	{
		super(b);
		this.b=b;
		System.out.println(b);
	}
	
	public static void main(String args[])
	{
		System.out.println("Hello");
		Abc2 a = new Abc2(10);
		a.show();
	}
}