import java.util.*;
class Insertele
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of array");
      int size=sc.nextInt();
      int a[]=new int[size];
      int b[]=new int[size+1];
      System.out.println("enter the elememts in array a");
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
          
        }
      System.out.println("emter the position of element to insert");
      int pos=sc.nextInt();
      System.out.println("enter the value to insert into the array");
      int value=sc.nextInt();
     insert(a,size,b,pos,value) ;

    }
    public static void insert(int a[],int size,int b[],int pos,int value)
    {
      int i;
      for(i=0;i<b.length;i++)
        {
          if(i==pos)
          {
            b[i]=value;
          }
          else if(i>pos)
          {
            b[i]=a[i-1];
          }
          else
          {
            b[i]=a[i];
          }
          System.out.println("the new inserted array is :"+b[i]);
        }
    }
  }