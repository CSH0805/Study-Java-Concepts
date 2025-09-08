package classfour;

public class NumberChecker {
    public boolean twoMultipleChecker(int number) {
//        number가 2의 배수인지 판단하는 메소드
//        return number % 2 == 0;


        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}