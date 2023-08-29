import java.util.*;
public class BacktrackingAlgorithm 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        int n=s.length();
        backtrack(s,0,n-1);
    }
    public static String swap(String a, int s, int l) 
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[s];
        charArray[s]=charArray[l];
        charArray[l]=temp;
        return String.valueOf(charArray);
    }
    public static void backtrack(String s,int idx, int n) 
    {
        if(idx==n)
        {
            System.out.println(s);
        }
        else 
        {
            for(int i=idx;i<=n;i++) 
            {
                s=swap(s,idx,i);
                backtrack(s,idx+1,n);
                s=swap(s,idx,i);             
            }
        } 
    }
}