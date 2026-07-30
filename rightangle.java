public class rightangle {
    public static void main(String args[])
    {
        int n=5;
        for(int i=0;i<=n;i++)
        {
             for(int j=n;j>=1;j--)
             {
                System.out.print(i>=j?"*":" ");
             }
             System.out.println();
           
        }
        
    }

    
}
