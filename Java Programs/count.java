import java.util.Scanner;

public class count{

    public static void main(String[] args) 
    { 
       Scanner sc=new Scanner(System.in);
       int n=10;
       char arr[]=new char[n];
       for(int i=0;i<n;i++)
       {
         arr[i]=sc.next().charAt(0);
       }

       int list[] = new int[arr.length];
       int count = 0;
       
       for(int i=0; i<arr.length; i++) 
       {
          int element = arr[i];
          boolean flag = false;
          for(int j=0; j<count; j++) {
             if(list[j] == element) {
                flag = true;
                break;
             }
          }
          if(flag) {
             continue;
          }

          for(int j=i+1; j<arr.length; j++) {
             if(arr[j] == element) {
                list[count++] = element;
                break;
             }
          }
       }
       System.out.println("Total Repeated elements: " + count);
       System.out.print("Repeated elements are: ");
       for (int i = 0; i < count; i++) {
          System.out.print(list[i]+" ");
       }      
    }
}