
public class identity {
    public static String ident(int[][] arr)
    {
        String b=" ";
        int r=arr.length;
        int c=arr[0].length;
   
        for(int j=0;j<r;j++)
        {
            if( arr[r-(j+1)][c-(j+1)]==1)
            {
               b="true"; 
            }
            else{
                b="no";
                break;
            }

        }
    
return b;
    }

  
    public static void main(String args[])
    {
        int[][] arr={{1,0,0,0},{0,1,0,0},{0,0,1,0},{0,0,0,1}};
        String s=identity.ident(arr);
        System.out.print(s);
    }
}  
