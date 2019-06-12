import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      int is_pal=-1;int i=0;int j=n-1;
      for(int idx=0;idx<n;idx++)
      {
        arr[idx]=in.nextInt();
      }
      while(i<j)
      {
          if(arr[i]==arr[j])
          {
            is_pal=0;
          }else
          {
            is_pal=1;
            break;
              }
        i++;
        j--;
        }
      
      if(is_pal==0)
      {
        System.out.print("Yes");
      }
      else
      {
        System.out.print("No");
      }
    }
}
