package classfour;

public class OddChecker {
    public boolean isOdd(int number){
        return number % 2 != 0;
        // 아래 코드와 동일함.
        // 위 한줄 코드를 더 많이 사용함.
        // true, false 를 어떻게 아냐?
        // number % 2 :  결과값이 0 아니면 1
        // number%2 != 0  : 결과값은 true  아니면 false
        // != : 비교연산자이기 때문에 항상 결과값은 true, false
        //   1 != 0 : true,   0 != 0 : false




//        if ( number%2 != 0)
//            return true;
//        else
//            return false;


    }
}

