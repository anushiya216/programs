import java.util.*;
public class smallestmissingnum 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        
      for(int k=0;k<t;k++)
      {
        int d=obj.nextInt();
        int cha=obj.nextInt();
        int arr[]=new int[cha];
        int arr2[]=new int[cha];
        for(int i=0;i<cha;i++)
        {
            arr[i]=obj.nextInt();
        }
        for(int i=0;i<cha;i++)
        {
            arr2[i]=0;
        }
        int a=0;
        for(int i=0;i<cha;i++)
        {
            int count=0;
            if(a==arr[i])
            {
                arr2[i]=count++;
                a++;
            }
        }
        Arrays.sort(arr);
        for(int i=0;i<cha;i++)
        {
            if(arr2[i]==0)
            {
                System.out.print(arr[0]+i);
            }
        }
      }
    }
}