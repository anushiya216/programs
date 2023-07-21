import java.util.*;
public class doctorsal 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int arr[]=new int[7];
        int sum=0;
        for(int i=0;i<7;i++)
        {
            arr[i]=obj.nextInt();
        }
        for(int i=0;i<7;i++)
        {
            if(arr[i]<=17)
            {
                sum+=200;
            }
            else if(arr[i]<40 && arr[i]>17)
            {
                sum+=400;
            }
            else if(arr[i]>=40)
            {
                sum+=300;
            }
        }
        System.out.print(sum);
    }
}
