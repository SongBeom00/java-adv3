package lambda.lambda5.mystream;

import java.util.List;

public class MyStreamMainV2 {
    public static void main(String[] args) {
        // 짝수만 남기고 남은 값의 2배 반환
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> result = MyStreamV2.of(numbers)
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .toList();

        System.out.println("result = " + result);
    }



}
