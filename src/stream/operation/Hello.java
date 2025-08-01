package stream.operation;

import java.util.stream.Stream;

public class Hello {

    public static void main(String[] args) {

        System.out.println("4. 무한 스트림 생성 - iterate()");
        // iterate: 초기값과 다음 값을 만드는 함수를 지정
        Stream<Integer> infiniteStream = Stream.iterate(0, n -> n + 2);
        infiniteStream.limit(3).forEach(System.out::println);
        int add = add(3, 4);
        System.out.println("add = " + add);
    }

    private static int add(int x, int y) {
        return x+y;
    }


}
