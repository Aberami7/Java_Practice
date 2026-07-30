public class sumtwodarray{
       public static void main(String args[])
    {
    int[][] arr={{1,2,3},{2,4,6},{7,5,4}};
    for(int i=0;i<arr.length;i++)
    {
        int s=0;

       int c =  0;
        for(int j=0;j<arr[i].length;j++)
        {
            s+=arr[i][j];
            c+=arr[j][i];

    
}
System.out.print(s+" ");
System.out.print(c+" ");
    }
}
    }


    
