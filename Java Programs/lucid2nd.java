import java.util.*;
public class lucid2nd 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int option;
        System.out.print("Enter Start Range: ");
        int s=obj.nextInt();
        System.out.print("Enter End Range: ");
        int e=obj.nextInt();
        int start[]=new int[10];
        int end[]=new int[10];
        end[0]=e;
        start[0]=s;
        int count=1;
        System.out.print(start[0]+" - "+end[0]);

      do
      {
        
        count++;
        System.out.print("\nEnter Start Range: ");
        s=obj.nextInt();
        System.out.print("Enter End Range: ");
        e=obj.nextInt();
        ans(s,e,start,end,count);
        System.out.print("\nDo You Want to continue? if ans is yes then press 1");
        option=obj.nextInt();
      }while(option==1);
    }
    public static void ans(int s,int e,int start[],int end[],int count)
    {
        int i=0;
      for(i=0;i<count;i++)
      {
        if(end[i]<s)
        {
            start[i++]=s;
            end[i++]=e;
        }
        else if(s<end[i] && s>start[i])
        {
            if(start[i]>s)
            {
                start[i]=s;
            }
            else if(end[i]<=e)
            {
                end[i]=e;
            }
        }
        // else 
        // {
        //     start[i++]=s;
        //     end[i++]=e;
        // }
      }
        for(int j=0;j<count-1;j++)
        {
            System.out.println(start[j]+" - "+end[j]);
        }

    }
}
