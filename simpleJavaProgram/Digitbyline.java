package simpleJavaProgram;
import java.util.*;
public class Digitbyline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,m=0,p=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number=");
        int n=sc.nextInt();
        while(n>0)
        {
       	a=n%10;
       	p=a+p*10;
       	n=n/10;
        }
        //System.out.println(p);
        while(p!=0)
        {
        	m=p%10;
        	System.out.println(m);
        	p=p/10;
        }
	}
	}


