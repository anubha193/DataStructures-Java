package Arrays;

public class EquibiliumPoint {
      public static int eqqq(int arr[]) {
    	  int cur1=0,cur2=0;
    	  int n=arr.length;
          if(n==1)
          return 1;
           if(n==2) return -1;
          for(int i=0;i<n;i++)
          {
              cur1+=arr[i];
          }
          for(int i=0;i<n;i++)
          {
              cur2+=arr[i];
              if(cur1==cur2)
              return i+1;
              cur1-=arr[i];
          }
          return -1;
      }
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {1,3,5,2,2};
      System.out.println(arr[eqqq(arr)-1]);
	}

}
