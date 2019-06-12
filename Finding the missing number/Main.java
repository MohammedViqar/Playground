import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      int arr_1[]=new int[n];
      for(int idx=0;idx<n;idx++)
      {
        arr[idx]=in.nextInt();
      }
      for(int i=0;i<n;i++)
      {
        int temp=arr[i];
        arr_1[temp-1]=arr[i];
        
      }
      for(int i=0;i<n;i++)
      {
        if(arr_1[i]==0)
        {
          System.out.print(i+1);
        }
      }
    }
}