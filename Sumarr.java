import java.util.*;
class Sumarr
  {
    public static void average(int a[])
    {
      int sum=0;
      int avg=0;
      for(int i=0;i<a.length;i++)
        {
         sum=sum+a[i];
        }
      avg=sum/a.length;
      System.out.println("the average of elements is"+avg);
    }
    
    public static void sum(int a[])
    {
      int sum=0;
      for(int i=0;i<a.length;i++)
        {
         sum=sum+a[i];
        }
      System.out.println("the sum of elements is"+sum);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of an array");
      int size=sc.nextInt();
      int[] a=new int[size];
      System.out.println("enter the values into the array ");
      for(int i=0;i<size;i++)
        {
        a[i]=sc.nextInt();
        }
      average(a);
      sum(a);
    }
  }