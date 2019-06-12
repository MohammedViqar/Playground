import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      for(int count=1;count<=2*n-1;count++)
      {
        if(count%2!=0)
          System.out.println(count);
      }
	}
}