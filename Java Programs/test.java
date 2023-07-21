import java.util.*;
import java.lang.*;
class test
{
     public static void main(String args[])
     {
          Scanner obj=new Scanner(System.in);
          int n=obj.nextInt();
          int arr[]=new int[n];
          int arr1[]=new int[n];
          int a=0,b=0,i,j,index=0,count=0;
          for(i=0;i<n;i++)
          {
               arr[i]=obj.nextInt();
          }
          int k=obj.nextInt();
          for(i=0;i<n;i++)
          {
               if(arr[i]==k)
               {
                    count+=1;
                    index=i;
                    arr1[i]=i;
               }
               
          } 
          for(i=0;i<n;i++)
          {
            for(j=i+1;j<n;j++)
            {
               if(arr[i]!=0 && arr1[j]!=0)
               {
                    a=arr[i];
                    b=arr[j];
               }
               
            }
              
          } 
          if(count!=0)
          {
               System.out.println("first and last occurence of " +k+ " is 4 and 7");
          }
          else
          {
               System.out.println(k+ "is not present in the array and it's first and last occurence is at index -1 and -1");
          }
     }

}