import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in=new Scanner(System.in);
      String str=in.nextLine();
      StringBuilder sb=new StringBuilder(str);
      int str_len=str.length();
      int front=0;
      int end=str_len-1;
      boolean is_matching=true;
      while(front<end)
      {
        if(str.charAt(front)==str.charAt(end))
           {
             is_matching=true;
             front++;
             end--;
           }
           else
           {
             is_matching=false;
             break;
           }
      }
      if(is_matching==true)
        System.out.print("Yes");
        else
          System.out.print("No");
        
    } 
}

