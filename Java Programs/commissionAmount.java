import java.util.*;
public class commissionAmount 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        int c1=5*5000/100;
        System.out.print("Enter Y if "+s+" has child members otherwise N : ");
        char choice=obj.next().charAt(0);
        String s3=",";
        int count=1;
        if(choice=='Y')
        {
            String s2=obj.next();
            String child[]=s2.split(s3,10);
            for(int i=0;i<s2.length();i++)
            {
                if(s2.charAt(i)==',')
                {
                    count++;
                }
            }
            c1=(count*10)*50;
            System.out.println("Total members :"+(count+1));
            System.out.println("COMMISSION DETAILS ");
            System.out.println(s+" : "+c1+"INR");
            for(int i=0;i<count;i++)
            {
                System.out.println(child[i]+" : "+(5*50)+"INR");
            }
        }
        else 
        {
            System.out.println("Total members :"+count);
            System.out.println("COMMISSION DETAILS ");
            System.out.println(s+" : "+c1+"INR");
        }
    }  
}