package simpleJavaProgram;
import java.util.*;
public class Allprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int flag=0;
           Scanner sc=new Scanner(System.in);
           System.out.println("enter the starting value=");
           int l=sc.nextInt();
           System.out.println("enter the ending value=");
           int h=sc.nextInt();
           sc.close();
           System.out.println("prime numbers are=");
           for(int i=l;i<=h;i++)
           {
        	   flag=0;
        	   for(int j=2;j*j<=i;j++)
        	   {
        		   if(i%j==0) {
        			   flag++;
        			   break;
        	   }
        	   }
        	   if(flag==0) {
        		   System.out.println(i);
        	   }
        	   
           }
	}
	
}
                                     