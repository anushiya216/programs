import java.util.*;
public class smallpath
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
        Arrays.sort(arr);
        System.out.print(arr[0]+" "+arr[1]);
    }
}