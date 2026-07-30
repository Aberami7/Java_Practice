import java.util.*;
public class longestpalindrome{
    public static void main(String args[])
    {
        String s="cbbd";

        char[] ch=s.toCharArray();
        System.out.print(Arrays.toString(ch)+"\n");
     for(int i=0;i<ch.length;i++)
     {
        for(int j=i+1;j<ch.length;j++)
        {
           if(ch[i]==ch[j])
           {
            System.out.print(s.substring(i,j+1)+"\n");
            
           }
        }
     }

    }

    

}
