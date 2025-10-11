package pre;

import java.util.Scanner;

public class Ban {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int number = stdin.nextInt();
        int sum = 0;

        for(int i = 1; i <= number; i++){
            sum+=i;
        }

        System.out.println(sum);
    }
}
