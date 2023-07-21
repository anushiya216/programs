class animal
{
    void eat()
    {
        System.out.println("eating...");
    }
}
class dog extends animal
{
    void bark()
    {
        System.out.println("barking...");
    }
}
class baby extends dog
{
    void weep()
    {
        System.out.println("weeping...");
    }
}
public class inheritance 
{
    public static void main(String[] args) 
    {
        baby d=new baby();
        d.eat();
        d.bark();
        d.weep();
    }
    
}
