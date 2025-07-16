package methodref.start;

import java.util.function.BinaryOperator;

public class MethodRefStartV3 {

    public static void main(String[] args) {
        // 메소드 참조(Method Reference) 문법인 클래스명::메서드명
        // 이미 정의된 메서드를 그대로 참조하여 람다 표현식을 더 간결하게 작성하는 방법
        BinaryOperator<Integer> add1 = MethodRefStartV3::add; // (x, y) -> add(x, y)
        BinaryOperator<Integer> add2 = MethodRefStartV3::add; // (x, y) -> add(x, y)

        Integer result1 = add1.apply(1, 2);
        System.out.println("result1 = " + result1);

        Integer result2 = add2.apply(1, 2);
        System.out.println("result2 = " + result2);
        
    }

    static int add(int x, int y){
        return x + y;
    }


}
