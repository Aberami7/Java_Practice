public class same {
    public static void main(String[] args) {
        
        int[][] arr={{1,2,3,4},{5,1,2,3},{6,5,1,2},{7,6,5,1}};
       for(int i=1;i<arr.length;i++)
       {
     for(int j=0;j<arr[i].length;j++)
     {
        if(arr[i][j]!=arr[i][j-1])
        {
        {
            System.out.print("false");
            return;
            
        }
    }
}
       }
System.out.print("true");
       }
    }

    
  
