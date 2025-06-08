package lambda.ex1;

public class M2After {


    public static void main(String[] args) {

        print(10,"kg");
        print(50,"kg");
        print(40,"g");
        print(200,"g");
    }

    public static void print(int a, String unit){
        System.out.println("무게 : " + a + unit);

    }

}
