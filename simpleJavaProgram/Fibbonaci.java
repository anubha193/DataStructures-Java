package simpleJavaProgram;
import java.util.*;
public class Fibbonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f1=0,f2=1;
		int f=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a number=");
       int n=sc.nextInt();
       System.out.println(f1);
       System.out.println(f2);
       for(int i=2;i<n;i++)
       {
    	 f=f1+f2;
    	 System.out.println(f);
    	 f1=f2;
    	 f2=f;
       }
	}

}
