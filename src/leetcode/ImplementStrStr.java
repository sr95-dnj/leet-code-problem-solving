package leetcode;

public class ImplementStrStr {

    public static void main(String[] args) {
        System.out.println(strStr("Hello", "lo"));
    }

    public static int strStr(String haystack, String needle)
    {
        if(needle.length()==0)return 0;
        int[] lps = lps(needle);
        int i = 0, j = 0;
        while(i < haystack.length())
        {
            if(haystack.charAt(i)==needle.charAt(j))
            {
                i++;
                j++;

                if(j==needle.length())
                {
                    return i-j;
                }
            }
            else if(j==0)
            {
                i++;
            }
            else
            {
                j = lps[j];
            }
        }

        return -1;
    }

    public static int[] lps(String s)
    {
        int[] res = new int[s.length()+1];
        int j = 0, i = 1;
        char[] carr = s.toCharArray();
        while(i < s.length())
        {
            if(carr[i]==carr[j])
            {
                i++;
                j++;
                res[i] = j;
            }
            else if(j==0)
            {
                i++;
            }
            else
            {
                j = res[j];
            }
        }

        return res;
    }

}
