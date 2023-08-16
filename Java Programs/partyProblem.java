import java.util.*;
public class partyProblem 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int e[]=new int[n];
        int l[]=new int[n];
        for(int i=0;i<n;i++)
        {
            e[i]=obj.nextInt();
            l[i]=obj.nextInt();
        }
        int max=0,count=0;
        for(int i=0;i<n;i++)
        {
            count=(count+e[i])-l[i];
            if(count>max)
            {
                max=count;
            }
        }
        System.out.println(max);
    }
    
}
