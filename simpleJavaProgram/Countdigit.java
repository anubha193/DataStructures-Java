package simpleJavaProgram;
import java.util.*;
public class Countdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, count =0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number=");
      int n=sc.nextInt();
     while(n!=0)
     {
    	 count++;
    	 n=n/10; 
     }
       System.out.println(count);
	}

}
