package Arrays;

import java.util.HashMap;

public class SetZero {
	static void booleanMatrix(int matrix[][])
    {
         HashMap<Integer,Boolean>map=new HashMap<>();
       HashMap<Integer,Boolean>map1=new HashMap<>();
       for(int i=0;i<matrix.length;i++){
           for(int j=0;j<matrix[0].length;j++){
               if(matrix[i][j]==1){
                   map.put(i,true);
                   map1.put(j,true);
               }
           }
       }
        for(int i=0;i<matrix.length;i++){
           for(int j=0;j<matrix[0].length;j++){
               if(map.containsKey(i)==true || map1.containsKey(j)==true){
                   matrix[i][j]=1;
               }
           }
       }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m[][]={{1, 0},
	              {0, 0}};
		booleanMatrix(m);
         for(int i=0;i<m.length;i++)
         {
        	 for(int j=0;j<m[0].length;j++)
        	 {
        		 System.out.print(m[i][j]+" ");
        	 }
        	 System.out.println();
         }
	}

}
