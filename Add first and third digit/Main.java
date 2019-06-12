import java.util.Scanner;
class Main{
	public static void main (String[] args) {
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int num1=n1/100;
      int num2=n1%10;
      int sum=num1+num2;
      System.out.println(sum);
	
	}
}