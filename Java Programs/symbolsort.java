import java.util.*;
public class symbolsort 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        char arr[]=new char[n];
        char arr2[]=new char[n];
        char arr3[]=new char[n];
        int k=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.next().charAt(0);
        }
        for(int i=0;i<n;i++)
        {
            arr2[i]=obj.next().charAt(0);
        }
        Arrays.sort(arr);
        Arrays.sort(arr2);
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if((int)arr[i]==(int)arr[j])
                {
                    arr3[k]=arr[i];
                    k++;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr3[i]+" ");
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
            System.out.print(arr3[i]+" ");
        }
    }
}
