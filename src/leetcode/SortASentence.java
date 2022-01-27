package leetcode;

import java.util.Arrays;

public class SortASentence {
    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
    }

    public static String sortSentence(String s){
        String[] ans=s.split(" ");
        int k=0;
        String[] ans1=new String[ans.length];
        for(int i=1;i<=ans.length;i++)
        {
            for(int j=0;j<ans.length;j++)
            {
                if(ans[j].contains(String.valueOf(i)))
                {
                    ans1[k]=ans[j];
                    k++;

                }
            }
        }
        String str= Arrays.toString(ans1);
        str=str.replace("[","")
                .replace(",","")
                .replaceAll("\\d","")
                .replace("]","");
        return str;
    }
}
