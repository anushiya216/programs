import java.util.*;
public class vendingMachine 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        String coffee[]={ "Espresso Coffee","Cappuccino Coffee","Latte Coffee"};
        String tea[]={"Plain Tea","Assam Tea","Ginger Tea","Cardamom Tea","Masala Tea","Lemon Tea","Green Tea","Organic Darjeeling Tea"};
        String soups[]={"Hot and Sour soup","Veg Corn soup","Tomato soup","Spicy Tomato soup"};
        String beverages[]={"Hot Chocolate Drink","Badam Drink","Badam-Pista Drink"};
        char c=obj.next().charAt(0);
        int n=obj.nextInt();
        System.out.println("Welcome to CCD ");
        System.out.println();
        if(c=='c' && n<coffee.length)
        {
            System.out.println("Enjoy your "+coffee[n-1]);
        }
        else if(c=='t' && n<tea.length)
        {
            System.out.println("Enjoy your "+tea[n-1]);
        }
        else if(c=='s' && n<soups.length)
        {
            System.out.println("Enjoy your "+soups[n-1]);
        }
        else if(c=='b' && n<beverages.length)
        {
            System.out.println("Enjoy your "+beverages[n-1]);
        }
        else 
        {
            System.err.println("Invalid Input");
        }
    } 
}