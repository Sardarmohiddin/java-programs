
    class Frequency
  {
    public static void main(String args[])
    {
      int a[]={2,3,2,1,3,4,3,5,3};
      int size=a.length;
      boolean b[]=new boolean[size];
      for(int k=0;k<size;k++)
        {
          b[k]=false;
        }
    System.out.println("Element -----------Frequency");
      for(int i=0;i<a.length;i++)
        {
          int count=1;
          if(b[i]==true)
            continue;
          for(int j=i+1;j<a.length;j++)
            {
              if(a[i]==a[j])
              {
                count++;
                b[j]=true;
              }
            }
          
          System.out.println(a[i]+"------------"+count);
        }
    }
  }
