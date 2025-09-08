package arrays;

public class TwoArrays {
    public static void main(String[] args){
        int[][] arr = {         //2차원 배열
                {1,2,3},        //row1
                {4,5,6},        //row2
                {7,8,9}         //row3
        };

        for(int row = 0; row < arr.length; row ++){
            for(int column = 0; column < arr[row].length; column++){
                // arr[row].lengh: row1,2에 있는 길이(3)보다 커지면 for문 종료
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}
