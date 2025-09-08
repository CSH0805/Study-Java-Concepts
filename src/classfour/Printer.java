package classfour;

public class Printer {
    public void printerOdd(boolean isOdd){
        System.out.println(isOdd ? "홀수" : "짝수");
        // 아래와 같은 명령어
        //  변수 ? 변수가 참일 때 : 변수가 거짓일 때
        // 참이면 홀수 출력
        // 거짓이면 짝수 출력


//        if ( isOdd )
//            System.out.println("홀수");
//        else
//            System.out.println("짝수");
//
    }


    public void printerMultiple(boolean isMultiple){
        System.out.println( isMultiple ? "2의 배수" : "2의 배수가 아님");


//        if ( isMultiple ){
//            System.out.println("2의 배수");
//        }
//        else {
//            System.out.println("2의 배수가 아닙니다.");
//        }
    }
}

