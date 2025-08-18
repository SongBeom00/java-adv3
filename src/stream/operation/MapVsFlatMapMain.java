package stream.operation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MapVsFlatMapMain {

    public static void main(String[] args) {
        List<List<Integer>> outerList = List.of(
                List.of(1, 2),
                List.of(3, 4),
                List.of(5, 6)
        );

        // for
        List<Integer> forResult = new ArrayList<>();
        for (List<Integer> list : outerList) {
            for (Integer i : list) {
                forResult.add(i);
            }
        }

        System.out.println("forResult = " + forResult);

        // map
        List<Stream<Integer>> mapResult = outerList.stream()
                .map(list -> list.stream())
                .toList();

        System.out.println("mapResult = " + mapResult);

        // flatMap 중첩 구조(컬렉션 안의 컬렉션, 배열안의 배열 등)를 일차원으로 바꾸는데 사용한다.
        List<Integer> flatMapResult = outerList.stream()
                .flatMap(list -> list.stream()) // 중첩 컬렉션을 편리하게 하나의 컬렉션으로
                .toList();
        System.out.println("flatMapResult = " + flatMapResult);

    }

}
