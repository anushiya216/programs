import java.util.*;
public class replaceSubArray 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        String s1=obj.nextLine();
        char arr[]=s1.toCharArray();
        String s2=obj.nextLine();
        String s3=obj.nextLine();
        int n=s2.length();
        int count=0;
        for(int i=0;i<s1.length();i++)
        {
            int a=i;
            for(int j=0;j<n;j++)
            {
                if(s1.charAt(a)==s2.charAt(j))
                {
                    count++;
                    a++;
                }
            }
            if(count==n)
            {
                s1.replace(s2,s3);
                for(int k=0;k<s2.length()-1;k++)
                {
                    arr[i+k]=' ';
                }
                arr[i+n]=s3.charAt(0);
            }  
        }
        System.out.println(s1);
        // for(int i=0;i<arr.length;i++)
        // {
        //     if(arr[i]!=' ')
        //     {
        //         System.out.print(arr[i]);
        //     }
        // }
     }    
}