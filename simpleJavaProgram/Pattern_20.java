package simpleJavaProgram;
import java.util.*;
public class Pattern_20 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a number");
		 
	        int n=scn.nextInt();
	        int sp=n/2;
	        int str=1;
	      
	        for(int i=1;i<=n;i++)
	        {
	          for(int j=1;j<=sp;j++){
	              if(i==sp+1)
	              System.out.print("*\t");
	              else
	              System.out.print("\t");
	          }
	          for(int k=1;k<=str;k++){
	               System.out.print("*\t");
	          }
	          if(i<=sp)
	          str++;
	          else
	          str--;
	          System.out.println();
	        }
	}

}
