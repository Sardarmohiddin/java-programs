import java.util.*;
class Sortingarr
  {
    public static void sortArr(int a[], int size)
    {
      int i,j;
      int temp=0;
      for(i=0;i<size;i++)
        {
          for(j=i+1;j<size;j++)
            {
              if(a[i]>a[j])
              {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
              }
            }
        }
      System.out.println("the sorted array is"+a[i]);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of array");
      int size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("enter the values in array");
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
      sortArr(a,size);
    }
  }