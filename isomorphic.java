import java.util.*;
public class isomorphic {
    public static void main(String[] args) {
        String s1 = "pap1r";
        String s2 = "titl2";
        int[] freq = new int[256]; //d]for number put 256 ***
        int[] freq2 = new int[256];
        for(char c : s1.toCharArray()){
            freq[c]++;
        }
        for(char c : s2.toCharArray()){
            freq2[c]++;
        }
        Arrays.sort(freq);
        Arrays.sort(freq2);
   for(int i = 0;i<freq.length;i++){
    if(freq[i] != freq2[i]){
        System.out.print("noisomorphic");
        return;
        
    }
   }
   System.out.print("yes");

    }
}
