public class boundary {
    public static void main(String args[])
    {
        int[][] arr={{1,2,3},{4,6,6},{7,8,9}};
        int r=arr.length;
        int c=arr[0].length;
        for(int j=0;j<r;j++)
        {
            System.out.print(arr[0][j]+"->");
        }
            for(int i=1;i<r;i++)
            {
                System.out.print(arr[i][c-1]+"->");
            }
             for(int j=r-2;j>=0;j--)
            {
                System.out.print(arr[r-1][j]+"->");
            }
            for(int i=r-2;i>=0;i--)
            {
         System.out.print(arr[i][0]+"->");
            }
        }
    }
    

