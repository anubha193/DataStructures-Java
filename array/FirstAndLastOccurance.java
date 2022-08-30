package array;

import java.util.ArrayList;

public class FirstAndLastOccurance {
	static int first(int arr[], 
            int x, int n)
{
int low = 0, high = n - 1, 
 res = -1;
while (low <= high) 
{
// Normal Binary Search Logic
int mid = (low + high) / 2;
if (arr[mid] > x)
 high = mid - 1;
else if (arr[mid] < x)
 low = mid + 1;

// If arr[mid] is same as 
// x, we update res and 
// move to the left half.
else 
{
 res = mid;
 high = mid - 1;
}
}
return res;
}

//If x is present in arr[] then returns 
//the index of LAST occurrence of x in 
//arr[0..n-1], otherwise returns -1 
static int last(int arr[], int x, int n)
{
int low = 0, high = n - 1, 
 res = -1;
while (low <= high) 
{
// Normal Binary Search Logic
int mid = (low + high) / 2;
if (arr[mid] > x)
 high = mid - 1;
else if (arr[mid] < x)
 low = mid + 1;

// If arr[mid] is same as x,
// we update res and move to 
// the right half.
else 
{
 res = mid;
 low = mid + 1;
}
}
return res;
}
public static ArrayList<Integer> sub(int arr[], int x, int n)
{
	 int start=-1;
     int end=-1;
     for(int i=0;i<n;i++)
     {
         if (x != arr[i])
             continue;
         if (start == -1)
             start = i;
         end = i;
     }
    ArrayList<Integer> ar=new ArrayList<>();
    ar.add(start);
    ar.add(end);
    return ar;
}
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int arr[]= {1,2,3,4,4,4,4,5,6};
          System.out.println(first(arr,4,arr.length)+1);
          System.out.println(last(arr,4,arr.length)+1);
          System.out.println(sub(arr,4,arr.length));
	}

}
