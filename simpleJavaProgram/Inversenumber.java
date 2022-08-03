package simpleJavaProgram;
import java.util.*;
public class Inversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("enter a number=");
         int n=sc.nextInt();
         int inv=0;
         int op=1;
         while(n!=0)
         {
        	 int od=n%10;
        	 int id=op;
        	 int ip=od;
        	 inv=inv+id*(int)Math.pow(10,ip-1);
        	 n=n/10;
        	 op++;
         }
         System.out.println(inv);
	}

}
