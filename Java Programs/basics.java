import java.util.*;
class pattrns
{
  public static void main(String[] args)  
  {
    Scanner obj=new Scanner(System.in);
    int a=obj.nextInt();
    int b=obj.nextInt();

    
    for(int i=a;i>0;i--)
    {
        for(int j=a;j>i;j--)
        {
            System.out.print(j+" ");
        }
        for(int j=i;j>0;j--)
        {
            System.out.print(i+" ");
        }
        
        System.out.println();
    }
  } 
}

// input
// 7 7
// output
// 7777777
// 7666666
// 7655555
// 7654444
// 7654333
// 7654322
// 7654321