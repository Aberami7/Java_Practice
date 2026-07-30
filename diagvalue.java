public class diagvalue {
    public static void main(String args[])
    {
  

        int[][] arr={{1,0,7},{0,4,0},{7,0,8}};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(i==j || i+j==arr.length-1)
                    {
                        if(arr[i][j]==0)
                        {
          System.out.print("false");
          return ;
                        }
                }
    }

}

System.out.print("true");
    }
}
