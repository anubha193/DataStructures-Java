package Recursion;

public class ParmutationString {
     static void parmutation(String str)
      {
    	 utilParmutation(str,0,"");  
      }
     static void utilParmutation(String str,int i,String cur)
     {
    	 if(i==str.length())
    	 {
    		 System.out.println(cur);
    		 return;
    	 }
    	 utilParmutation( str, i+1, cur);
    	 utilParmutation(str, i+1,cur+str.charAt(i));
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        parmutation("abc");
	}

}
