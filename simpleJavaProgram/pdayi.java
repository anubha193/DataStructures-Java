package simpleJavaProgram;
import java.util.*;
public class pdayi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          System.out.println("enter the value of a=");
          int a=sc.nextInt();
          System.out.println("enter the value of b=");
          int b=sc.nextInt();
          System.out.println("enter the value of c=");
          int c=sc.nextInt();
          if(a>b)
          {
        	if(a>c)
        		System.out.println("the largest value is="+a);
        	else 
        		System.out.println("the largest value is="+c);
          }
          else //if(a>c)
        	  {
        	  if(a>b)
          		System.out.println("the largest value is="+a);
          	else 
          		System.out.println("the largest value is="+b);  
          }
//          else
//          {
//        	  if(b>a)
//            		System.out.println("the largest value is="+c);
//            	else 
//            		System.out.println("the largest value is="+b);  
//          }
	}

}
