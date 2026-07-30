public class gas {
    public static void main(String args[])
    {
        int[] gas={1,2,3,4,5};
        int[] cost={3,4,5,1,2};
        int tank=0;
        int a=0;
        int b=0;
        int start=0;
         for(int i=0;i<gas.length;i++)
         {
            a+=gas[i];
            b+=cost[i];
         }
        if(a>=b)
        {
        for(int i=0;i<gas.length;i++)
        {
            tank+=gas[i]-cost[i];
            if(tank<0)
            {
                tank=0;
                start+=1;
            }
            }
            System.out.print(start);
        }
    }
}

