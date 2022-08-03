package simpleJavaProgram;
import java.util.*;
public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,a=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number=");
        int n=sc.nextInt();
        while(n!=0)
        {
        	a=n%10;
        	sum=a+sum*10;
        	n=n/10; 
        	System.out.println(a);
        }
        System.out.println(sum);
	}

}
