class bank
{
    void getbalance()
    {
        System.out.println("0");
    }
}
class bank_A extends bank
{
    void getbalance()
    {
        int a=1000;
        System.out.println(a);
    }
}
class bank_B extends bank
{
    void getbalance()
    {
        int a=1500;
        System.out.println(a);
    }
}
class bank_C extends bank
{
    void getbalance()
    {
        int a=2000;
        System.out.println(a);
    }
}
public class bank1 
{
    public static void main(String[] args) 
    {
        bank_A a=new bank_A();
        bank_B b=new bank_B();
        bank_C c=new bank_C();
        System.out.print("deposited amount in bank A:");
        a.getbalance();
        System.out.print("deposited amount in bank B:");
        b.getbalance();
        System.out.print("deposited amount in bank C:");
        c.getbalance();
    }
}

// output
// deposited amount in bank A:1000
// deposited amount in bank B:1500
// deposited amount in bank C:2000