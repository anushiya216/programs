import java.util.*;
public class validTruckNo 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        for(int k=0;k<t;k++)
        {
            int flag=1;
            obj.next();
            String s=obj.nextLine();
            char arr[]=s.toCharArray();
            System.out.println(arr.length);
            
                if(((int)(arr[0]-'0')+(int)(arr[1]-'0'))%2!=0 || ((int)(arr[3]-'0')+(int)(arr[4]-'0'))%2!=0 || ((int)(arr[4]-'0')+(int)(arr[5]-'0'))%2!=0 || ((int)(arr[7]-'0')+(int)(arr[8]-'0'))%2!=0)
                {
                    flag=0;
                    
                }
                if((arr[2]<65 && arr[2]> 91) || (arr[2]=='A' || arr[2]=='E' || arr[2]=='I' || arr[2]=='O' || arr[2]=='U' || arr[2]=='Y'))
                    {
                        flag=0;
                        
                    }
                if(arr[6]!='-')
                    {
                        flag=0;
                    }
        
            if(flag==1)
            {
                System.out.println("valid");
            }
            else
            {
                System.out.println("invalid");
            }
            
        }
        
        
    }
    
}
