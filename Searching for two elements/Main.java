import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int arr_size=in.nextInt();
      int arr[]=new int[arr_size];
      for(int index=0;index<=arr_size-1;index++)
      {
        arr[index]=in.nextInt();
      }
      int search_elem_1=in.nextInt();
      int search_elem_2=in.nextInt();
      int is_matched_1=0;
      int is_matched_2=0;
      int index_1=0;
      int index_2=0;
      for(int index=0;index<=arr_size-1;index++)
      {
        if(search_elem_1==arr[index])
        {
          is_matched_1=1;
          index_1=index;
          break;
        }
      }
      for(int index=0;index<=arr_size-1;index++)
      {
        if(search_elem_2==arr[index])
        {
          is_matched_2=1;
          index_2=index;
          break;
        }
      }
      if(is_matched_1==1)
        System.out.println(index_1);
        else
          System.out.println("-1");      
       
      if(is_matched_2==1)
        System.out.println(index_2);
        else
          System.out.println("-1");
    }
}

