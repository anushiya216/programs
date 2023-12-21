import java.util.*;
public class stringDecryption 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        int n=Integer.parseInt(s);
        int m=s.length();
        int arr[]=new int[m];
        int v=1;
        while(n>9)
        {
            arr[m-v]=n%10;
            n=n/10;
            v++;
        }
        arr[0]=n;
        String s2=obj.nextLine();
        int a=0;
        for(int i=0;i<s2.length();i++)
        {
            if(s2.charAt(i)=='R')
            {
                a++;
            }
            else if(s2.charAt(i)=='T')
            {
                if(arr[a]!=9)
                {
                    arr[a]+=1;
                }
            }
            else if(s2.charAt(i)=='L')
            {
                a--;
            }
            else if(s2.charAt(i)=='D')
            {
                if(arr[a]!=0)
                {
                    arr[a]-=1;
                }
            }
            else if(s2.charAt(i)=='S')
            {
                int b=(Character.getNumericValue(s2.charAt(i+1)))-1;
                
                int temp=arr[b];
                arr[b]=arr[a];
                arr[a]=temp;
                i++;
            }
        }
        for(int i=0;i<m;i++)
        {
            System.out.print(arr[i]);
        }
    }  
}