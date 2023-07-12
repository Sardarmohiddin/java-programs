import java.util.*;
class Deleting
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of array");
      int size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("enter the elememts in array");
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
          
        }
      System.out.println("emter the position  element to delete");
      int pos=sc.nextInt();
      delete(a,size,pos);
    }
    public static void delete(int a[],int size,int pos)
    {
      for(int i=pos;i<size-1;i++)
        {
          a[pos]=a[i+1];
          
        }
      for(int i=0;i<size-1;i++)
        {
        System.out.println("the output is"+a[i]);
        }
    }
  }
