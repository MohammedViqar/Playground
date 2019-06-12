import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int base=in.nextInt();
    int exp=in.nextInt();
    int pos=power_of_number(base,exp);
    System.out.println(pos);
  }
  public static int power_of_number(int a,int b)
  {
    int power=a;
    for(int count=1;count<b;count++)
    {
      power=power*a;
    }
    return power;
  }
}