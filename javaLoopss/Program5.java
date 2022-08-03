package javaLoopss;
class Animal
{
	//int legs;
	static int count;
	String name;
	public Animal(String name)
	{
		System.out.println(name);
	
	}
	
	void neha()
	{
		System.out.println(Math.PI);
	}
	
	
	
}
public class Program5 {

	static void anubha()
	{
		System.out.println(Animal.count); 
	}
	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		
		Animal an=new Animal("mst");
		Animal am= new Animal("not mst");
		am.name="anubha";
		System.out.println(an.name);
		System.out.println(am.name);
		
	anubha();
	}

}
