import java.util.*;
public class salary {
    
    public static void main(String args[])//1672
    {
        int[][] arr={{1,2,30},{4,5,6},{7,8,9}};
        int r=arr.length;
        int[] arr2=new int[r];
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            for(int j=0;j<arr[i].length;j++)
            {
            sum+=arr[i][j];
            }
            arr2[i]=sum;
        }
       // System.out.print(Arrays.toString(arr2)+"\n ");
       // Arrays.sort(arr2);
       // System.out.print(arr2[arr2.length-1]);
       System.out.print(Arrays.stream(arr2).max().orElse(-1));
    }
}
