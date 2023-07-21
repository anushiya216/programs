import java.util.*;
class array
{
    void position()
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n];
        int i,count=0,pos=0;
        
        for(i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        int k=obj.nextInt();
        for(i=0;i<n;i++)
        {
          if(arr[i]==k)
          {
            count=1;
            pos=i;
          }
        }
        find as=new find();
        as.pos1(pos,count);
    }
}
class find
{
    void pos1(int pos,int count)
    {
        if(count==1)
        {
            System.out.println("element found at index: "+pos);
        }
        else 
        {
            System.out.println("Not Found");
        }
    }
        
}
class main extends array
{
    public static void main(String args[])
    {
        main a=new main();
        a.position();
    }
}