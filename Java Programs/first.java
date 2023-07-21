import java.util.*;
public class first {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n];
        int i,j;
        for(i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }

        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    n=n-1;  
                }

            }
            
        }
        System.out.println(n);
    }
}