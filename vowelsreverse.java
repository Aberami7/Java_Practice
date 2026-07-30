public class vowelsreverse {
    public static void main(String args[])
    {
        String s="Hello World";
        String str="";
        String h="";
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
        if(ch =='a'|| ch=='e'|| ch=='u'|| ch=='o'|| ch=='i')
        {
            str+=ch;
        }
    }
     StringBuilder sb=new StringBuilder(str);
    sb.reverse();
      int j=0;
      for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
        
        if(ch =='a'|| ch=='e'|| ch=='u'|| ch=='o'|| ch=='i')
        {
            h+=sb.charAt(j);
            j++;
        }
        else
        {
            h+=ch;
        
        }
    }
    System.out.print(h);
}
}

