package stream.basic;

import java.util.List;
import java.util.stream.Stream;

public class DuplicateExecutionMain {
    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1, 2, 3, 4);
        stream.forEach(System.out::println); // 1. 최초 실행

        // 오류 메시지 IllegalStateException: 스트림이 이미 작동했거나 닫혔습니다.
        // stream.forEach(System.out::println); // 2. 스트림 중복 실행 X, 주석 풀고 실행하면 예외 발생

        List<Integer> list = List.of(1, 2, 3, 4);
        Stream.of(list).forEach(System.out::println);
        Stream.of(list).forEach(System.out::println);


    }
}
