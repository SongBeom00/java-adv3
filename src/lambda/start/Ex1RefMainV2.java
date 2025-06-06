package lambda.start;

import lambda.Procedure;

import java.util.Random;

// 익명 클래스 사용, 람다 사용
public class Ex1RefMainV2 {


    public static void main(String[] args) {
        procedure(() -> {
            //코드 조각 시작
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);
            //코드 조각 종료
        });
        procedure(() -> {
            //코드 조각 시작
            for (int i = 1; i <= 3; i++) {
                System.out.println("i = " + i);
            }
            //코드 조각 종료
        });
    }

    private static void procedure(Procedure procedure){
        long startNs = System.nanoTime();
        // 코드 조각 시작
        procedure.run();
        // 코드 조각 종료
        long endNs = System.nanoTime();
        System.out.println("실행 시간: " + (endNs - startNs) + "ns");
    }


}