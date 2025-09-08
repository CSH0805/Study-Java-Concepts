package arrays;

import java.sql.SQLOutput;

public class prablem {
    public static void main(String[] args) {
        int[] student = {90, 80, 70, 60, 50};
        int total = 0;



        for (int i = 0; i < student.length; i++){
             total += student[i];
        }


        System.out.println(total);

        double average = (double) total / student.length;
        System.out.println(average);
    }
}
