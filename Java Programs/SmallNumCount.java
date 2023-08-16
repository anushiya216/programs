import java.util.*;
public class SmallNumCount 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int k=obj.nextInt();
        int arr[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
            if(arr[i]<k)
            {
                count++;
            }
        }
        System.out.println(count);
    }   
}

// 7
// 5
// 1 2 6 7 3 4 9
// 4