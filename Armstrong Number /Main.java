import java.util.Scanner;
import java.lang.*;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int count=0,num=n;
      double sum=0;
      if(n==0)
        System.out.println("Armstrong Number");
     else
     {
       for(;n>0;count++)
       
      {
       
         n=n/10;
      }
      
     }
      n=num;
      while(n>0)
      {
        int last_digit=n%10;
        sum=sum+Math.pow(last_digit,count);
        n=n/10;
      }
      if(sum==num)
      {
        System.out.println("Armstrong Number");
      }
      else
      {
        System.out.println("Not a Armstrong Number");
      }
	}
}
