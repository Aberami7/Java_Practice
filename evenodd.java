import java.util.*;
public class evenodd {
    public static void main(String args[])
    {
        int[] arr={1,7,2,6,8,5};
        Arrays.sort(arr);
        int j=1;
       //ystem.out.print(Arrays.toString(arr));
        for(int i=0;i<arr.length;i+=2)
        {
            arr[j]=arr[i];
        }
        System.out.print(Arrays.toString(arr));


    }
}
