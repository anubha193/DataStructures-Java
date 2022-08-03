package simpleJavaProgram;
import java.util.*;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of inputs=");
        int t=sc.nextInt();
        for(int j=0;j<t;j++) {
       System.out.println("enter a number=");
        int n=sc.nextInt();
        for(int i=2;i*i<=n;i++)
        {
        	if(n%i==0)
        		flag++;
        }
        if(flag==0)
        	System.out.println("Prime");
        else
        	System.out.println("Not prime");
	}}

}
