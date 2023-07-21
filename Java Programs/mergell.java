import java.util.*;
import java.io.*;
import java.util.ArrayList;
public class mergell 
{
  public static void main(String[] args) 
  {
    Scanner obj=new Scanner(System.in);
    LinkedList <Integer> ll=new LinkedList<>();
    LinkedList <Integer> ll2=new LinkedList<>();
    ll.add(1);
    ll.add(4);
    ll.add(8);
    ll.add(15);
    ll.add(19);
    ll2.add(2);
    ll2.add(7);
    ll2.add(9);
    ll2.add(10);
    ll2.add(16);
    LinkedList <Integer> ll3=new LinkedList<>();
    int arr[]=ll.toArray();
    int arr2[]=ll.toArray();
    int k=0;
    for(int i=0;i<arr.length;i++)
    {
      for(int j=0;j<arr2.length;j++)
      {
        if(arr[i]<arr2[j]) //&& arr[i+1]>arr2[j])
        {
          ll3.add(k,arr[i]);
          k++;
        }
        else
        {
          ll3.add(k,arr[j]);
          k++;
        }
      }
    }
    System.out.print(ll3 + " ");
  }
}