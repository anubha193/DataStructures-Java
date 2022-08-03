package Recursion;

public class PalinDromeArray {
	public static boolean palinArray(int[] a, int n)
    {
        int count=0;
   for(int i=0;i<n;i++)
   {
     count=count+plain(a[i]);  
   }
   if(count==n)
   return true;
   else
   return false;
    }
    static int plain(int n)
    {
             int temp=n;
             int sum=0;
     while(n>0){    
     int  r=n%10;  //getting remainder  
     sum=(sum*10)+r;    
     n=n/10;    
     }    
      if(temp==sum)    
     return 1;    
     else    
    return 0;     
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]= {111 ,222 ,333 ,444, 555};
       int n=arr.length;
       if( palinArray(arr,n))
    	   System.out.println("Array is palindrom array");
       else
    	   System.out.println("Array is not palindrom array");
    	   
	}

}
