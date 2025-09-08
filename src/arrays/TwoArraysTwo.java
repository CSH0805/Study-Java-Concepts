package arrays;

public class TwoArraysTwo {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for(int row = 0; row < arr.length; row++){
            // row < arr.lenght: arr에 길이 만큼 실행 현재 arr는 2차원 배열
            // int[2][3] 현재 arr에 있는 각 배열에 길이는 2이고 그 안에 들어갈 수 있는 길이는 3이다.
            for(int column = 0; column < arr[row].length; column++){
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}
