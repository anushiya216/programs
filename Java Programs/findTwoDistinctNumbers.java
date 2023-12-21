import java.util.*;
public class findTwoDistinctNumbers 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int m=(2*n)+2,a=0;
        int arr[]=new int[m];
        int ans[]=new int[2];
        for(int i=0;i<m;i++)
        {
            arr[i]=obj.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            int count=1;
            for(int j=0;j<m;j++)
            {
                if(arr[i]==arr[j] && i!=j)
                {
                    count++;
                    break;
                }
            }
            if(count==1)
            {
                ans[a]=arr[i];
                a++;
            }
        }
        Arrays.sort(ans);
        for(int i=0;i<2;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
