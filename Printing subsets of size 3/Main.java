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
      subset(arr_size,arr);
    }
    public static void subset(int arr_size,int arr[])
    {
      for(int index=0;index<=arr_size-1;index++)
      {
        for(int i=index+1;i<=arr_size-1;i++)
        {
          for(int m=i+1;m<=arr_size-1;m++)
          {
            System.out.print("("+arr[index]+","+" "+arr[i]+","+" "+arr[m]+")"+" ");
          }
        }
        if(index<arr_size-1)
        System.out.print("\n");
      }
    }
        
      }
    
