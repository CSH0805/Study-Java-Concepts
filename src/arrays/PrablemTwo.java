package arrays;

import java.util.Scanner;

public class PrablemTwo {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int[] numbers = new int[5];
        System.out.println("5개의 정수를 입력하세요: ");

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = stdin.nextInt();
        } //값을 넣기

        System.out.println("출력");

        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i]);
            if(i < numbers.length){
                System.out.print(", ");
            } //우리가 하고 싶은 것은 마지막에 ,를 붙이지 않는 것.
              // 현재 numbers에 길이는 5이다. 그리고 index로 따졌을 땐 number에 길이는 4이다.
              // 그래서 i < numbers.length로 contiue같은 것을 사용하지 않고 false(거짓)을 만들어서
              // 마지막에 ,가 출력 되지 않게함.
        } // 값을 출력
    }
}
