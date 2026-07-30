import java.util.Arrays;

public class Symmetric {
    public static void main(String args[])        // array ==transpose means "SYMMENTRIC"//
        {
             int[][] arr={{1,2,3},{2,4,5,},{3,5,6}};
             int[][] res=new int[3][3];
     {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                res[i][j]=arr[j][i];
            }
            System.out.println();
        }
        }
        if(Arrays.deepEquals(arr, res))
        {
            System.out.print("Symmentric");
        }
        else{
            System.out.print("not Symmentric");
        }
    
}
}
