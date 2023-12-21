import java.util.*;
public class moveEmptyPocketsToLast 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();   
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        int count=0,k=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                arr[count++]=arr[i];
            }
        }
        for(int i=count;i<n;i++)
        {
            arr[i]=0;
        }
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}

//output
// 7
// 7 6 4 0 6 0 3
// 7 6 4 6 3 0 0 