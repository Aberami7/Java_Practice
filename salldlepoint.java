import java.util.Arrays;

public class salldlepoint {
    public static void main(String args[])
    {
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        int[] arr1=new int[arr.length];
        int[] arr2=new int[arr[0].length];

        // Row minimum
        for(int i=arr.length-1;i>=0;i--)
        {
            int min = arr[i][0];

            for(int j = 1; j < arr[i].length; j++) {
                if(arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
            arr1[i]=min;
        }

        System.out.println(Arrays.toString(arr1));

        // Column maximum
        for(int i=arr[0].length-1;i>=0;i--)
        {
            int max = arr[0][i];

            for(int j = 1; j < arr.length; j++) {
                if(arr[j][i] > max) {
                    max = arr[j][i];
                }
            }
            arr2[i]=max;
        }

        System.out.println(Arrays.toString(arr2));

        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                    return;
                }
            }
        }

        System.out.print("no saddle");
    }
}
