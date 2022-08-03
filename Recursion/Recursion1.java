package Recursion;

public class Recursion1 {
     static int natural(int n)
     {
    	 if(n==0)
    		 return 0;
    	 return ( natural(n-1)+n);
    	
    	
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println(natural(5));
         String str="anubha";
        		 int n=str.length();
        		 StringBuilder st=new StringBuilder(str);
        		 
         System.out.println(str.toLowerCase());
	}

}
