import java.util.*;
class alice
{
    public static void main(String[] args)
    {
        Scanner obj =new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
             arr[i]=obj.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=arr[0])
            {
                count++;
            }
        }
        System.out.println(count);
    }
}

// input
// 5
// 0 1 0 1 0
// output
// 2