import java.util.*;
public class product {
    public static void main(String args[])
    {
        
    //prefix ***
    
    int[] arr={1,2,3,4};       //ipo 1 na 2*3*4=24 ,  2 na 1*3*4=12 ,3 na 1*2*4=8  4 na 1*2*3=6
    int res[]=new int[arr.length];
     res[0]=1;
    for(int i=1;i<arr.length;i++)
    {
        res[i]=res[i-1]*arr[i-1];
    }
    System.out.print(Arrays.toString(res));

  

//suffix***
int suffix=1;
for(int i=arr.length-1;i>=0;i--)  
{

res[i]=res[i]*suffix;
suffix*=arr[i];
}
System.out.println(Arrays.toString(res));
    }
}



    
  
  
    
