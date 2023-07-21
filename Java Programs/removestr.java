import java.util.*;

import javax.sound.sampled.Line;
public class removestr 
{
    public static void main(String[] args) 
    {
        int n,i;
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        String arr[]=s.split(" ");
        n=arr.length;
        String s2=obj.nextLine();
        for(i=0;i<n;i++)
        {
            if(arr[i]==s2)
            {
                for(j=i+1;<n;i++)
                {
                    System.out.print(arr[i+1]+" ");
                }
            }
            else if(arr[i]!=s2)
            {
                System.out.print(arr[i]+" ");
            }
            else 
            {
                System.out.print("-1");
            }
        }
    }
}
