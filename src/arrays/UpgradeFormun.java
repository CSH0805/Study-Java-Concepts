package arrays;

public class UpgradeFormun {
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,5};

        //일반 for문
//        for(int i = 0; i < numbers.length; i++ ){
//            //int number = numbers[i];
//            System.out.println(numbers[i]);
//        }

        // for-each
        for (int number : numbers){
            System.out.println(number);
        }

        // for-each문 사용을 못할 경우: 증가하는 index 값 필요
        for (int i = 0; i < numbers.length; i++){
            System.out.println("number " + i + "번의 결과는: " + numbers[i]);
            // 이런식으로 i의 값이 1씩 더해지거나 앞에 무언가를 붙여 줘야 할떄
        }
    }
}
