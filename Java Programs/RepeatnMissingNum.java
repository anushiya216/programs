import java.util.*;
public class RepeatnMissingNum 
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
    for(int i=0;i<n-1;i++)
    {
        if(arr[i]==arr[i+1])
        {
            System.out.print(arr[i]+" ");
            break;
        }
    }
    System.out.print((int)arr[0]-1);
  }   
}
