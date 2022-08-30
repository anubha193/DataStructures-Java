package Mathmatices;

public class PrintDivisor {
        static void divisor(int n)
        {
        	for(int i=1;i*i<=n;i++)
        		if(n%i==0) {
        			System.out.println(i);
       			     if(n/i!=i && n/i!=n)
       			System.out.println(n/i);
        		}
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		divisor(25);
	}

}
