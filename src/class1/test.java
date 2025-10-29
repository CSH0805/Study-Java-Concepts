package class1;

import java.util.Scanner;
import java.util.Random;

// 예시 코드
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int count = 0;

        int cer = random.nextInt(100);

        boolean a = true;

        while(a){
            System.out.print("숫자를 입력하세요: ");
            int personNumber = scanner.nextInt();
            if (cer > personNumber){
                System.out.println("더 큽니다.");
                count++;
                System.out.println("현재 count는 " + count +"입니다.");
                System.out.println();
            } else if (cer < personNumber){
                System.out.println("더 작습니다.");
                count ++;
                System.out.println("현재 count는 " + count +"입니다.");
                System.out.println();
            } else {
                System.out.println("같습니다.");
                a = false;
            }
        }
//        System.out.println();
        System.out.println("총 " + count + "만에 맞췄습니다.");
    }
}
