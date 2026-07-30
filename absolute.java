class absolute
{
    public static void main(String args[])
    {
        int[] arr={8,3,5,2};
        int n=arr.length;
         while(n>0)
         {
            for(int i=0;i<arr.length-1;i++)
            {
              arr[i]=Math.abs(arr[i]-arr[i+1]);
            }
            n--;
         }
         System.out.print(arr[0]);
    }
}