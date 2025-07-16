package methodref.start;

import java.util.function.BinaryOperator;

public class MethodRefStartV1 {

    public static void main(String[] args) {
        // 인자가 1개면 Unary 2개면 Binary
        BinaryOperator<Integer> add1 = (x,y) -> x + y;
        BinaryOperator<Integer> add2 = (x,y) -> x + y;

        Integer result1 = add1.apply(1, 2);
        System.out.println("result1 = " + result1);

        Integer result2 = add2.apply(1, 2);
        System.out.println("result2 = " + result2);

    }
}
