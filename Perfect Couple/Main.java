import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner in=new Scanner(System.in);
      int arr_size=in.nextInt();
      int arr[]=new int[arr_size];
      for(int index=0;index<arr_size;index++)
      {
        arr[index]=in.nextInt();
      }
      int value=in.nextInt();
      pair(arr_size,arr,value);
    }
    public static void pair(int arr_size,int arr[],int value)
    {
      for(int index=0;index<arr_size-1;index++)
      {
        if(arr[index]<=value)
        {
          for(int i=index;i<arr_size;i++)
          {
            int m=arr[index]+arr[i];
            if(m==value)
            {
              System.out.println(arr[index]+","+" "+arr[i]);
            }
          }
        }
        
    }
}
}
