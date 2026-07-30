public class pangramarray 
{
    public static void main(String args[])
    {
        String s="The quick brown fox jumps over the lazy dog";
        s=s.toLowerCase().replaceAll(" ","");
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            freq[ch-'a']++;
        }
        for(int i:freq)
        {
            if(i==0)
            {
                System.out.print("no");
                return;
            }
        }
        System.out.print("pangram");
        }
    }
    

