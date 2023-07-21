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
class baby extends animal
{
    void weep()
    {
        System.out.println("weeping...");
    }
}
public class hierarchyinheritance 
{
    public static void main(String[] args) 
    {
        baby a=new baby();
        dog d=new dog();
        a.eat();
        d.bark();
        a.weep();
    }
}
