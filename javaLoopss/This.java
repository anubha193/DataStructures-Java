package javaLoopss;
class Anima
{
	static String name;
	public Anima(int legs)
	{
		
	}
	public Anima( String name)
	{
		this(8);
		this.name=name;
		System.out.println(name+" is created");
	}
 void walking()
	{
		System.out.println("i am walking");
		System.out.println(name);
		
		
	}
	
	
}
public class This {
public static void main(String[] args)
{
	Anima an=new Anima("dog");
	an.walking();
	anubha();
}
static void anubha()
{
	System.out.println("hey! i am anubha");
}
}
