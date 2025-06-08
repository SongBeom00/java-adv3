package lambda.ex1;

import lambda.MyFunction;

public class M5Return {

    public static void main(String[] args) {

        System.out.println("sum = " + getOperation("sum").apply(1, 2));
        System.out.println("sub = " + getOperation("sub").apply(1, 2));
        System.out.println("xxx = " + getOperation("xxx").apply(1, 2));


    }

    static MyFunction getOperation(String operator){
        return switch (operator) {
            case "sum" -> (a, b) -> a + b;
            case "sub" -> ((a, b) -> a - b);
            default -> ((a, b) -> 0);
        };
    }
}
