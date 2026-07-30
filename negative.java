import java.util.*;
public class negative 
{
    public void negNumber(int arr[],int n)
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
         if(arr[i]<0)
         {
         count++;
         System.out.print(i+" ");
         }
        }
        System.out.print(count);
    }
    public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            negative obj=new negative();
            obj.negNumber(arr,n);
           

        }
    

    
}
