import java.util.*;
import java.lang.*;
import java.io.*;
class matrix1
{
    int i,r,c,j,r2,c2;
    int arr[][]=new int[r][c];
    int arr2[][]=new int[r2][c2];
    void getrow()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter r:");
        r=obj.nextInt();
        System.out.println("enter r2:");   
        r2=obj.nextInt();
    }
    void getcol()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter c:");
        c=obj.nextInt();
        System.out.println("enter c2:");
        c2=obj.nextInt();
    }
    void setele()
    {
        
        Scanner obj=new Scanner(System.in);
        for(i=0;i<r;i++)
        {
          for(j=0;j<c;j++)
          {
            arr[i][j]=obj.nextInt();
          }
        }
        
        for(i=0;i<r2;i++)
        {
          for(j=0;j<c2;j++)
          {
            arr[i][j]=obj.nextInt();
          }
        }
    }
    void add()
    {
        
        if(r==r2 && c==c2)
        {
            int addm[][]=new int[r][c];
            for(i=0;i<r;i++)
        {
          for(j=0;j<c;j++)
          {
            addm[i][j]=arr[i][j]+arr2[i][j];
            
          }
        }
        for(i=0;i<r;i++)
        {
          for(j=0;j<c;j++)
          {
            System.out.print(addm[i][j]+" ");
          }
          System.out.println();
        }
        }
        else 
        {
            System.out.println("Matrices cannot be addable");
        }
    }
    void mul()
    {
        int mulm[][]=new int[3][3];
        for(i=0;i<r;i++)
        {
          for(j=0;j<c;j++)
          {
            mulm[i][j]=0;
            for(int k=0;k<r;k++)
            {
                mulm[i][j]+=arr[i][k]*arr2[k][j];  
            }
            System.out.print(mulm[i][j]+" ");
          }
          System.out.println();
        }
    }
}
public class matrix extends matrix1
{
    public static void main(String[] args) 
    {
        matrix m=new matrix();
        m.getrow();
        m.getcol();
        m.setele();
        m.add();
        m.mul();

    }
}