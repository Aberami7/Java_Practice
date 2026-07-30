public class wordreverse {
    public static void main(String args[])
    {
        String s="I love Java";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                sb.append(s.charAt(i));
            }
            else
            {
                System.out.print(sb.reverse()+" ");
                sb.setLength(0);
            } 
        }
        System.out.print(sb.reverse());
        

    
}
}
