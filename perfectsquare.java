import java.util.*;
public class perfectsquare {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        for(int i=1;i<n;i++)
        {
 
        if(n==i*i)
        {
            a=n;
        }
    }
          if(n==a)  
        {
            System.out.print("perfect");
            
        }
        else{
            System.out.print("not");
            
        }
    }

    }
    


