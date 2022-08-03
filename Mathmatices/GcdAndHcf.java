package Mathmatices;

public class GcdAndHcf {
    public static int gcd(int a,int b)
    {
    	for(int i=Math.min(a, b);i>1;i--) {
    		if(a%i==0 && b%i==0)
    			return i;
    	}
    	return 1;
    }
    public static int gcd2(int a,int b)
    {
    	if(a==b)
    		return a;
    	if(b>a)
    		return gcd2(b,a);
    	return gcd2(a-b,b);
    }
    public static int gcd3(int a,int b)
    {
    	
    	if(b>a)
    		return gcd3(b,a);
    	if(b==0)
    		return a;
    	return gcd3(a%b,b);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a=36;
       int b=24;
       System.out.println(gcd2(a,b));
       System.out.println(gcd(a,b));
       System.out.println(gcd3(a,b));
       System.out.println((a*b)/gcd(a,b));
	}

}
