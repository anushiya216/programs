import java.util.*;

public class findelementarr 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n,i;
        n=obj.nextInt();
        int arr[]=new int[n+1];
        for(i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        int k=obj.nextInt();
        Arrays.sort(arr);
        for(i=0;i<n;i++)
        {
            if(arr[i]==k)
        {
            System.out.println(arr[k]);
            break;
        }
        }
    }    
}
// output 1
// 6
// 7 10 4 3 20 15
// 3
// 7
// output 2
// 6
// 7 10 4 3 20 15
// 4
// 10