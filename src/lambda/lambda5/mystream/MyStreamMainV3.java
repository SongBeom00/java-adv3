package lambda.lambda5.mystream;

import java.util.List;

public class MyStreamMainV3 {

    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Apple", 100),
                new Student("Banana", 80),
                new Student("Berry", 50),
                new Student("Tomato", 40)
        );

        // 점수가 80점 이상인 학생의 이름을 추출해라
        List<String> result = ex1(students);
        System.out.println("result = " + result);

        // 점수가 80점 이상이면서 이름이 5글자인 학생의 이름을 대문자로 추출해라
        List<String> result2 = ex2(students);
        System.out.println("result2 = " + result2);


    }

    private static List<String> ex2(List<Student> students) {
        return MyStreamV3.of(students)
                .filter(n -> n.getScore() >= 80)
                .filter(n -> n.getName().length() == 5)
                .map(n -> n.getName().toUpperCase())
                .toList();
    }

    private static List<String> ex1(List<Student> students) {
        return MyStreamV3.of(students)
                .filter(s -> s.getScore() >= 80)
                .map(s -> s.getName())
                .toList();
    }

}
