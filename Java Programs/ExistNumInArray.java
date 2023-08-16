import java.util.*;
public class ExistNumInArray 
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int k=obj.nextInt();
        int j=obj.nextInt();
        int arr[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
            if(arr[i]>k && arr[i]<j)
            {
                count++;
                System.out.print(i);
            }
        }
       
    }
    
}
