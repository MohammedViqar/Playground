import java.util.Scanner;
class Main{
  public static int sum_of_numbers(int m)
  {
    int sum=0;
    for(int count=1;count<=m;count++)
    {
      sum=sum+count;
      
    }
    return sum;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int son=sum_of_numbers(n);
      System.out.println(son);
	}
}
