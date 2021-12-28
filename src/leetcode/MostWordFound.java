package leetcode;

public class MostWordFound {

    public static void main(String[] args) {

        String[] str = {"Hello! How are you?", "I'm fine"};

        int i = mostWordsFound(str);
        System.out.println(i);
    }

    public static int mostWordsFound(String[] s) {
        int length=s.length,max=0;
        for(int i=0;i<length;i++)
        {
            int count=0;
            for(char p:s[i].toCharArray())
            {
                if(p==' ')
                    count++;
            }
            count++;
            max=Math.max(count,max);
        }
        return max;
    }
}
