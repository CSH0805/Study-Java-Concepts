package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);


        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int start = stdin.nextInt();

        int[] numbers = new int[start];

        int sum = 0;
        int mean = 0;

        System.out.println(start + "개의 정수를 입력하세요: ");
        for(int i = 0; i < start; i++) {
            int num = stdin.nextInt();
            numbers[i] = num;
            sum += numbers[i];
        }

        mean += (double) sum / start;

        System.out.println(sum);
        System.out.println(mean);
    }
}