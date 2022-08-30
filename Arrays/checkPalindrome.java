package Arrays;

public class checkPalindrome {
	public static boolean check(String str) {
		
	    // WRITE YOUR CODE HERE
		int n=str.length();
        for(int i=0;i<n/2;i++)
        {
            if(str.charAt(i)!=str.charAt(n-i))
                return false;
        }
        return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(check("abcba"));
	}

}
