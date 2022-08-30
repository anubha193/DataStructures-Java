package Arrays;

public class RoWithMax1s {
     static int matrix(int arr[][],int n,int m)
     {
    	 int max=-1;
         int i=0,j=m-1;
         while(i<n && j>=0)
         {
             if(arr[i][j]==1)
             {
                 j--;
                 max=Math.max(max,i);
             }else
             i++;
         }
         return max;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [][]arr={{0, 1, 1, 1},
               {0, 0, 1, 1},
               {1, 1, 1, 1},
               {0, 0, 0, 0}};
       System.out.println(matrix(arr,arr.length,arr[0].length));
	}

}
