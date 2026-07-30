import java.util.*;
public class circularray {
    public static void main(String args[])
    {
        
        int[] arr={3,-2,1,1};
        int[] res=new int[arr.length];
        
            for(int i=0;i<arr.length;i++) // res[i]=nums[(i+nums[i]%n)+n)%n ]
            { 
                int j=0;
                if(arr[i]>0 || arr[i]<0)
                {
                    while(j<arr[i])
                    {
                        res[i]=arr[arr[i]];
                        j++;
                    }
                }
               
        }
        System.out.print(Arrays.toString(res));
    }
}

