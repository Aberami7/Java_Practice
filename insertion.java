import java.util.*;
public class insertion {
    public static void main(String args[])
    {
        int insert=3;
        int[] arr={1,2,3,5};
        int[] res=new int[arr.length+1];
        for(int i=0;i<insert;i++)
        {
            res[i]=arr[i];
        }
       res[insert]=4;
       for(int i=insert+1;i<res.length;i++)
{
        res[i]=arr[i-1];
       }
       System.out.print(Arrays.toString(res));
    }
}




