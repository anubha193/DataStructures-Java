package Arrays;

import java.util.HashMap;

public class maximum0and1 {
	static int max(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			arr[i]=(arr[i]==0)?-1:1;
		}
		HashMap<Integer, Integer> hm
        = new HashMap<Integer, Integer>();
		 hm.put(0, -1);
		int max=0;
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];
			if(hm.containsKey(sum))
				max=Math.max(max,i-hm.get(sum));
			else
				hm.put(sum, i);
		}
return max;
		
	}
	static int maxLen(int[] arr, int n)
    {
        // Your code here
		  HashMap<Integer, Integer> hM
          = new HashMap<Integer, Integer>();

      // Initialize sum of elements
      int sum = 0;

      // Initialize result
      int max_len = 0;
      int ending_index = -1;
      for (int i = 0; i < n; i++) {
          arr[i] = (arr[i] == 0) ? -1 : 1;
      }

      // Traverse through the given array

      for (int i = 0; i < n; i++) {
          // Add current element to sum

          sum += arr[i];

          // To handle sum=0 at last index

          if (sum == 0) {
              max_len = i + 1;
              ending_index = i;
          }

          // If this sum is seen before,
          // then update max_len if required
          if (hM.containsKey(sum)) {
              if (max_len < i - hM.get(sum)) {
                  max_len = i - hM.get(sum);
                  ending_index = i;
              }
          }
          else // Else put this sum in hash table
              hM.put(sum, i);
      }

      for (int i = 0; i < n; i++) {
          arr[i] = (arr[i] == -1) ? 0 : 1;
      }

      int end = ending_index - max_len + 1;
      System.out.println(end + " to " + ending_index);

      return max_len;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,1,0,1 };
     System.out.println(maxLen(arr,arr.length));
     System.out.println(max(arr,arr.length));
	}

}
