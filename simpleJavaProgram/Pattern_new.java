package simpleJavaProgram;
import java.util.*;
public class Pattern_new {

	public static void main(String[] args) {
		System.out.println("enter a number=");
		 Scanner scn = new Scanner(System.in);
	        int n=scn.nextInt();
	        int n1=n/2+1;
	        int n2=n/2;
	        for(int i=1;i<=n1;i++)
	        {
	            for(int j=n1;j>=i;j--)
	            {
	                System.out.print("*\t");
	            }
	            for(int k=1;k<=i;k++)
	            {
	                System.out.print("\t"); 
	            }
	            for(int m=2;m<=i;m++)
	            {
	                 System.out.print("\t");
	            }
	            for(int m=n1;m>=i;m--)
	            {
	                 System.out.print("*\t");
	            }
	            System.out.println("\t");
	        }
	        for(int i=1;i<=n2;i++)
	        {
	            for(int j=1;j<=i+1;j++)
	            {
	                 System.out.print("*\t");
	            }
	            
	             for(int k=n2;k>=i;k--)
	             {
	                  System.out.print("\t");
	             }
	             for(int m=n2-1;m>=i;m--)
	             {
	                 System.out.print("\t");
	             }
	             for(int m=1;m<=i+1;m++)
	             {
	                 System.out.print("*\t");
	             }
	              System.out.println();
	        }
	           

	}

}
