package Arrays;
import java.util.*;
public class ArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		
        System.out.println("enter the size of an array=");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the element of array=");
        for(int i=0;i<n;i++)
        {
        	arr[i]=sc.nextInt();
        }
        System.out.println("enter the element to be search in array=");
        int temp=sc.nextInt();
        
        
        int f2=0,f3=0;
        for(int i=0;i<n;i++)
        {
        	if(temp==arr[i])
        	{
        		f3=i;
        		f2++;
        		break;
        		}
        }
        if(f2==0)
        	System.out.println("not found");
        else
        	System.out.println("element "+temp+" found on index "+(f3+1)+" in array!");
        }
	}


