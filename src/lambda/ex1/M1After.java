package lambda.ex1;

import lambda.MyFunction;
import lambda.Procedure;

public class M1After {

    public static void main(String[] args) {

        myFunction1(() -> System.out.println("Good Morning!"));
        myFunction1(() -> System.out.println("Good Afternoon!"));
        myFunction1(() -> System.out.println("Good Evening!"));

        myFunction2("Good Morning!");
        myFunction2("Good Afternoon!");
        myFunction2("Good Evening!");

    }

    public static void myFunction2(String message){
        System.out.println("=== 시작 ===");
        System.out.println(message);
        System.out.println("=== 끝 ===");
    }



    public static void myFunction1(Procedure myFunction){
        System.out.println("=== 시작 ===");
        myFunction.run();
        System.out.println("=== 끝 ===");

    }



}
