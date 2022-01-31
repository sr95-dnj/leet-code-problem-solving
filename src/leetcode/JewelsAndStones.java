package leetcode;

public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {

        int res = 0;
        for(int i=0; i<jewels.length(); i++){
            for(int j =0; j<stones.length(); j++){
                if(jewels.charAt(i)== stones.charAt(i)){
                    res++;
                }
            }
        }
        return res;
    }
}
