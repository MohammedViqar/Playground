import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int k=in.nextInt();
      int arr[]=new int[n];
      int temp[]=new int[k];
      int j=1;
      for(int i=0;i<n;i++)
      {
        arr[i]=in.nextInt();
      }
      for(int i=0;i<n;i++)
      {
        int m=arr[i];
        temp[m-1]++;
      }
      for(int i=0;i<k;i++)
      {
        
        System.out.println(j+" "+temp[i]);
        j++;
      }
        
      
    }
}