package Mathmatices;

public class PrimeOrNot {
     static boolean prime(int n)
     {
    	 if(n==1)return false;
    	 int flag=0;
    	 for(int i=2;i*i<=n;i++)
    	 {
    		 if(n%i==0)
    			 flag++;
    	 }
    	 if(flag==0)return true;
    	 else
    		 return false;
     }
     static boolean primeAdvance(int n)
     {
    	 if(n==1)return false;
    	 if(n==2 ||n==3)return true;
    	 if(n%2==0 || n%3==0)return false;
    	 for(int i=5;i*i<=n;i+=6)
    		 if(n%i==0|| n%(i+2)==0)return false;
    	 return true;
     }
	public static void main(String[] args) {
		
	if(prime(53))
    System.out.println("Prime");
	else	
		System.out.println("not prime");
	if(primeAdvance(53))
	        System.out.println("Prime");
			else
				System.out.println("not prime");
	}

}
