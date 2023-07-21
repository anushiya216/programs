import java.util.*;
class batsman 
{
    void bat()
    {
        System.out.println("I an Batsman");
    }
}
class bowler extends batsman
{
    void bowl()
    {
        System.out.println("I an Bowler");
    }
}
class allrounder extends bowler
{
    void both()
    {
        System.out.println("I an Batsman and bowler");
    }
    public static void main(String[] args) {
        allrounder b=new allrounder();
        b.bat();
        b.bowl();
        b.both();
    }
}