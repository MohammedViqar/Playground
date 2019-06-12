import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int first=0,second=0;
      second=(n%10);
      while(n>9)
      {
        n/=10;
      }
        first=n;
      int sum=first+second;
      System.out.println(sum);
	}
}