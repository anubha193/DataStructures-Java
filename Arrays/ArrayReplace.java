package Arrays;

public class ArrayReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int arr[]= {17,18,5,4,6,1};
         int n=arr.length;
         for(int i=0;i<n;i++)
         { 
        	 int max=arr[i+1];
        	 for(int j=i+1;j<n;i++)
        	 {
        		 
        		 if(max>arr[j]) {
        			 max=arr[j];
        		 }
        	 }
        	arr[i]=max;
         }
         arr[n-1]=-1;
         System.out.println("the final array is=");
         for(int i=0;i<n;i++)
         {
        	 System.out.print(arr[i]+"  ");
         }
	}

}
