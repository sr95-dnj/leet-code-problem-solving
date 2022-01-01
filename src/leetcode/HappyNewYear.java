package leetcode;

import java.util.Calendar;


public class HappyNewYear {
    public static void main(String[] args) {

        int year = Calendar.getInstance().get(Calendar.YEAR);
        int newYear = 2022;

        if(year == newYear){
            System.out.println("Happy New Year " + year);
        }else{
            System.out.println("Bye Bye 2021");
        }
    }
}
