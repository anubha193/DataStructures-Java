package simpleJavaProgram;
import java.util.*;
public class Countdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, count =0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number=");
      int n=sc.nextInt();
      int a=0;
      int sum=0;
     while(n!=0)
     {
    	 a=n%10;
    	  sum+=a;
    	 n=n/10; 
     }
       System.out.println(sum);
	}

}
