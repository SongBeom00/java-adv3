package lambda.ex2;

import java.util.Scanner;

public class BuildGreeterExample {
    // 고차 함수, greeting 문자열을 받아, "새로운 함수를" 반환
    public static StringFunction buildGreeter(String greeting) {
        return name -> greeting + ", " +name;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String apply1 = buildGreeter("hello").apply(sc.next());
        System.out.println(apply1);
        String apply2 = buildGreeter("Hi").apply(sc.next());
        System.out.println(apply2);
    }



}