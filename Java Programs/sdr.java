import java.util.*;
class sdr
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a[]=new String[n+1];
        for (int i=0;i<n+1;i++)  
        {  
       a[i]=sc.nextLine();
        }  
        for (int i=0;i<n+1;i++)  {
            for (int j=0;j<n+1;j++)  {
               if(a[i].length() < a[j].length()){
                 String temp=a[i];
                  a[i]=a[j];
                  a[j]=temp;
                 }
            }
    }
    for (int i=0;i<n+1;i++)  
    {  
    System.out.print(a[i]+" ");
    }
    }
}