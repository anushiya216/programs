import java.util.*;
public class abc
{
  public static void isSumPossible (int arr[], int n, int x)
  {
    int flag=0;
    for (int i = 0; i < n; i++)
    {
        for(int j=i;j<n;j++)
        {
            if(arr[i]+arr[j]==x)
            {
                flag=1;
                break;
            }
        }
    }
    if(flag==1)
    {
        System.out.println("true");
    }
    else 
    {
        System.out.println("False");
    }
  }
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt ();
    int x = sc.nextInt ();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++)
    {
        arr[i] = sc.nextInt ();
    }
      
    isSumPossible (arr, n, x);
  }
}