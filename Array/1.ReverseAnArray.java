/*package whatever //do not write package name here */
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)
	{
	
     Scanner scan=new Scanner(System.in);
      int n=scan.nextInt();
      for(int j=0;j<n;j++)
      {
          int length=scan.nextInt();
          int arr[]=new int[length];
          for(int i=0;i<length;i++)
          {
             arr[i]=scan.nextInt();
          }
        int start=0;
        int end=arr.length-1;
        
        while(start<=end)
        {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
            start++;
            end--;
        }
        
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
      }
	}
}
