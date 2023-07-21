import java.util.*;
class test2{

        public static void main(String args[])
        {
            int i,count=0;
             Scanner obj=new Scanner(System.in);
             String s =obj.nextLine();
             char ch[]=s.toCharArray();
             for(i=0;i<=s.length()-1;i++)
             {
                 if(ch[i]=='a' || ch[i]=='e' ||ch[i]=='i' ||ch[i]=='o' || ch[i]=='u' || ch[i]=='A' || ch[i]=='E' ||ch[i]=='I' ||ch[i]=='O' || ch[i]=='U')
                 count++;
                 
             }   
             System.out.println(count);
        }
    }