import java.util.*;
public class findArrElement 
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
        int key=obj.nextInt();
        for(int i=0;i<n;i++)
        {
            if(key==arr[i])
            {
                System.out.println("YES");
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("NO");
        }
    }

    
}
