package lambda.lambda3;

public class GenericMain5 {

    public static void main(String[] args) {
        GenericFunction<String,String> upperCase = new GenericFunction<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        };
        String result1 = upperCase.apply("hello");
        System.out.println("result1 = " + result1);

        GenericFunction<Integer,Integer> square = new GenericFunction<Integer, Integer>() {
            @Override
            public Integer apply(Integer s) {
                return s * s;
            }
        };
        Integer result2 = square.apply(3);
        System.out.println("result2 = " + result2);

    }

    @FunctionalInterface
    interface GenericFunction<T, R>{
        R apply(T s);
    }


}
