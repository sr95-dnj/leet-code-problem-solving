package leetcode;

public class FinalValueofVariableAfterPerformingOperations {
    public static int finalValueAfterOperations(String[] operations) {
        int res=0, a=0, b=0;
        for(String s : operations){
            if(s.equals("++X") || s.equals("X++")){
                a +=1;
            }
            if(s.equals("--X") || s.equals("X--")){
                b +=1;
            }
        }



        return res = a-b;
    }

    public static void main(String[] args) {
        String[] s = {"--X","X++", "--X"};
        int i = finalValueAfterOperations(s);
        System.out.println(i);
    }
}
