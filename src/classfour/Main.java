package classfour;

import java.util.Scanner;


public class Main {
    public static void main(String[] args){

        Scanner stdin = new Scanner(System.in);
        // stdin에다가 Scanner(클래스)에 권한을 넘겨줌.

        int inputNumber = stdin.nextInt();
        // int 형태의 inputNumber을 입력 받음.

        NumberChecker numberchecker = new NumberChecker();
        // numberchecker에 NumberChecker에 권한을 넘겨줌

        Printer printer = new Printer();
        // printer에다가 Printer 클래스의 권한을 넘겨줌.

        OddChecker oddchecker = new OddChecker();
        // oddchecker 변수에다가 OddChecker 클래스에 권한을 넘겨줌.

        boolean result = numberchecker.twoMultipleChecker(inputNumber);
        // boolean 형태로 result를 선언하고
        // NumberChecker 클래스 안에 있는 twoMultipleChecker 메서드에 inputNumber에 값을 넘겨줌.


        printer.printerMultiple(result);
        // printer 안에 있는 printerMultiple메서드에다가 result 값을 넘겨줌
        // 그럼 printerMultiple은 true or false를 받게 됨.

        result = oddchecker.isOdd(inputNumber);
        //

        printer.printerOdd(result);
        //


    }
}

