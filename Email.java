import java.util.*;
class Email
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the email");
      String mail=sc.nextLine();
      char ch;
      int acount=0;
      int dcount=0;
      int mcount=0;
      int scount=0;
      int ncount=0;
      for(int i=0;i<mail.length();i++)
        {
          ch=mail.charAt(i);
          if(ch>='A' && ch<='Z'||ch>='a'&& ch<='z') 
         {
           acount++;
         }
          else if(ch>='0' && ch<='9')
          {
            dcount++;
          }
            else if(ch=='@')
            {
              mcount++;
            }
              else if(ch=='.')
            {
              ncount++;
            }
       else {
         scount++;
            }
        }
      
      if(mcount>0 && ncount>0)
      {
      if(acount>0 && dcount>0 && scount>0)
      {
        System.out.println("valid email");
      }
      }
      else
        System.out.println("in valid email");
          
           
       
        }
    }
  