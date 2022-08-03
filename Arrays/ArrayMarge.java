package Arrays;

import java.util.Arrays;

public class ArrayMarge {
    
	static  void sort(int arr1[],int arr2[],int m,int n)
     {
    	  int i = 0, j = 0, k = m - 1;//last index of first array
          while (i <= k && j < n) {
              if (arr1[i] < arr2[j])
                  i++;
              else {
                  int temp = arr2[j];
                  arr2[j] = arr1[k];
                  arr1[k] = temp;
                  j++;
                  k--;
              }
          }
          Arrays.sort(arr1);
          Arrays.sort(arr2);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]={ 1, 5, 9, 10, 15, 20 };
		int arr2[]= { 2, 3, 8, 13 };
		int n=arr2.length;
		int m=arr1.length;
		sort(arr1,arr2, m, n);
		System.out.println("the sorted array is=");
       for(int i=0;i<m;i++)
       {
    	   System.out.print(arr1[i]+" ");
       }
       System.out.println();
       for(int i=0;i<n;i++)
       {
    	   System.out.print(arr2[i]+" ");
       }
	}

}
