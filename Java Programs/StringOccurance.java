import java.util.*;
public class StringOccurance 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        String s2=obj.nextLine();
        int ans=0;
        ArrayList<Integer> start=new ArrayList<>();
        ArrayList<Integer> end=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            int count=0,a=i;
            for(int j=0;j<s2.length();j++)
            {
                if(s.charAt(i)!=s2.charAt(j))
                {
                    break;
                }
                
                else 
                {
                    if(s.charAt(i)==s2.charAt(j))
                    {
                        i++;
                        count++;
                    }
                    if(count==s2.length())
                    {
                        start.add(i-s2.length());
                        end.add(i-1);
                        ans++;
                        i--;
                    }
                }
            }
            i=a;
        }
        System.out.println("No.of.Occurence:"+ans);
        System.out.print("Starting Positions : ");
        for(int i=0;i<start.size();i++)
        {
            System.out.print(start.get(i) +" ");
        }
        System.out.print("\nEnding Positions : ");
        for(int i=0;i<end.size();i++)
        {
            System.out.print(end.get(i) +" ");
        }
    }
}
// Aabcabcaaaabbbbabcabcaabc
// abc
// No.of.Occurence:5
// Starting Positions : 1 4 15 18 22
// Ending Positions : 3 6 17 20 24