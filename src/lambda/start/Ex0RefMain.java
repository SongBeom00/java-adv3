package lambda.start;

public class Ex0RefMain {

    public static void helloJava(String str){
        hello(str);
    }

    public static void helloSpring(String str){
        hello(str);
    }

    private static void hello(String input) {
        System.out.println("프로그램 실행");
        System.out.println(input);
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        helloJava("Hello Java");
        helloSpring("Hello Spring");
    }


}
