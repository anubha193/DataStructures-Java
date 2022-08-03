package simpleJavaProgram;

public class StringMethods {

	public static void main(String[] args) {
     String s1=new String("anubha");
     String s3="my name is anubha";
     String s2=new String("            rajput");
     String s4="javatpoint is a very good website";
     System.out.println(s1.length());
     System.out.println(s1.isEmpty());
     System.out.println(s2.trim()); 
     System.out.println(s2);
     System.out.println(s3.subSequence(4,11));
     System.out.println(s4.replaceFirst("a","e"));
     
	}

	

}
