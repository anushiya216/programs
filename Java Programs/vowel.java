import java.util.*;
public class vowel 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n,i;
        String s=obj.nextLine();
        char arr[]=s.toCharArray();
        n=arr.length;
        for(i=0;i<n;i++)
        {
            if(arr[i]==97 || arr[i]==101 || arr[i]==105 || arr[i]==111|| arr[i]==117)
            {
                arr[i]=arr[arr[i]-32];
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }
    }
}