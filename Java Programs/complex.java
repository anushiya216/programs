import java.util.*;

class complex1
{
    void sum(int a,int b,int c,int d)
    {
        System.out.println((a+c) +" + "+(b+d)+"i");
    }
    void sub(int a,int b,int c,int d)
    {
        System.out.println((a-c) +" + "+(b-d)+"i");
    }
    void mul(int a,int b,int c,int d)
    {
        System.out.println(((a*c)-(b*d)) +" + " +((a*d)+(b*c)) +"i");
    }
}

public class complex 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        int c=obj.nextInt();
        int d=obj.nextInt();
        complex1 co=new complex1();
        co.sum(a,b,c,d);
        co.sub(a,b,c,d);
        co.mul(a,b,c,d);
    }
}



// input
// 8 4
// 6 2
// output
// 14 + 6i
// 2 + 2i
// 40 + 40i