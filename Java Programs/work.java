import java.util.*;
class employee extends work
{
    void getinfo(int n,int s)
    {
        System.out.println("salary:"+s);
        System.out.println("no.of working hrs per day:"+n);
    }
    void addsalary(int s)
    {
        if(s<500)
        {
            s+=10;
            System.out.println(s);
        }
        else 
        {
            System.out.println(s);
        }
    }
    void addwork(int n,int s)
    {
        if(n>6)
        {
            s+=5;
            System.out.println(s);
        }
        else 
        {
            System.out.println(s);
        }
    }
}
public class work 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int s=obj.nextInt();
        int n=obj.nextInt();
        employee e=new employee();
        e.getinfo(n,s);
        e.addsalary(s);
        e.addwork(n,s);
    }
}

// input
// 450
// 7
// output
// salary:450
// no.of working hrs per day:7
// 460
// 455
