class quad
{
    void declare()
    {
        System.out.println();
    }
}
class rectangle extends quad
{
    void area1(int l,int b)
    {
        int a=l*b;
        System.out.println(a);
    }
}
class parallellogram extends quad
{
    void area2(int l,int h)
    {
        int a=l*h;
        System.out.println(a);
    }
}
class trapezoid extends quad
{
    void area3(int l,int b,int h)
    {
        int a=((l+b)/2)*h;
        System.out.println(a);
    }
}
class square extends quad
{
    void area4(int l)
    {
        int a=l*l;
        System.out.println(a);
    }
}
public class shapes 
{
    public static void main(String[] args) 
    {

        int l=7,b=5,h=4;
        rectangle r=new rectangle();
        System.out.print("area of rectangle:");
        r.area1(l,b);
        parallellogram p=new parallellogram();
        System.out.print("area of parallellogram:");
        p.area2(l,h);
        trapezoid t=new trapezoid();
        System.out.print("area of rectangle:");
        t.area3(l,b,h);
        square sq=new square();
        System.out.print("area of square:");
        sq.area4(l);
    }
}


// output
// area of rectangle:35
// area of parallellogram:28
// area of rectangle:24
// area of square:49