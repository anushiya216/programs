import java.util.*;
import java.lang.*;
public class paint
{
    static void min(int arr[][],int size)
    {
        int arr1[][]=new int[size][3];
        arr1[0][0]=arr[0][0];   
        arr1[0][1]=arr[0][1];
        arr1[0][2]=arr[0][2];
        for(int i=0;i<size;i++)
        {
            arr1[i][0]=Math.min(arr1[i-1][1],arr1[i-1][2])+arr[i][0];
            arr1[i][1]=Math.min(arr1[i-1][0],arr1[i-1][2])+arr[i][1];
            arr1[i][2]=Math.min(arr1[i-1][0],arr1[i-1][1])+arr[i][2];
        }
        System.out.println(Math.min(arr1[size-1][0],Math.min(arr1[size-1][1],arr1[size-1][2])));
    }
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in); 
        int i,j;
        int m=obj.nextInt();
        int n=obj.nextInt();
        int arr[][]=new int[m][n];
        for(i=0;i<m;i+=1)
        {
          for(j=0;j<n;j+=1)
          {
            arr[i][j]=obj.nextInt();
          }
        }
        int size=arr.length;
        min(arr,size);
    }
}
