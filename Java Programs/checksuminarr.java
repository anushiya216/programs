import java.util.*;
public class checksuminarr 
{
   public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int flag=0,i,j,sum;
        int arr[]={5,7,1,2,8,4,3};
        sum=obj.nextInt();
        for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==sum)
                {
                    flag=1;
                    break;
                }
            }
        }
        if(flag==1)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}