import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in=new Scanner(System.in);
    int num=in.nextInt();
    int n1=num/100;
    int n2=num%10;
    int x=(num/10)%10;
    System.out.println((n2*100)+(x*10)+n1);
  }
}