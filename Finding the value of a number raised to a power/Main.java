import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int e=in.nextInt();
      int r=n;
      int count=2;
      while(count<=e)
      {
        r=n*r;
        count++;
      }
      System.out.print(r);
    }
}