import java.util.*;
public class Light 
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int arr[]=new int[10];
        int m=obj.nextInt();
        arr[0]=arr[9]=0;
        for(int i=1;i<=8;i++)
        {
            arr[i]=obj.nextInt();
        }
        int arr2[]=Arrays.copyOf(arr,10);
        while(m!=0)
        {
            for(int i=1;i<=8;i++)
            {
                if(arr[i-1]==arr[i+1])
                {
                    arr2[i]=0;
                }
                else
                {
                    arr2[i]=1;
                }
            }
            for(int k=0;k<10;k++)
            {
                arr[k]=arr2[k];
            }
            m--;
        }
        for(int k=1;k<9;k++)
        {
            System.out.print(arr[k]+" ");
        }
    }
}
