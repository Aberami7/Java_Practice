import java.util.*;
class sum
{
  public static int sumNum(int n,int arr[]) 
  {
  
    int sum=0;
    for(int i=0;i<n;i++)
    {
    if(arr[i]%2==0)
    {
      sum+=arr[i];
    }
}
    return sum;
  } 

  public static void main (String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
       int x=sumNum(n,arr);
       System.out.print(x);
    }
}