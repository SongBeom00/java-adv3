package methodref;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodRefEx2 {
    public static void main(String[] args) {

        // 1.   정적 메서드 참조
        Function<String,String> staticMethod1 = name -> Person.greetingWithName(name);
        Function<String,String> staticMethod2 = Person::greetingWithName; // 클래스::정적메서드

        System.out.println("staticMethod1.apply () = " + staticMethod1.apply("kim"));
        System.out.println("staticMethod2.apply() = " + staticMethod2.apply("kim"));

        // 2. 특정 객체의 인스턴스 참조
        Person person = new Person("Kim");
        Function<Integer,String> instanceMethod1 = number -> person.introduceWithNumber(number);
        Function<Integer,String> instanceMethod2 = person::introduceWithNumber; // 객체::인스턴스메서드

        System.out.println("instanceMethod1.apply() = " + instanceMethod1.apply(50));
        System.out.println("instanceMethod2.apply() = " + instanceMethod2.apply(50));

        // 3. 생성자 참조
        Function<String,Person> newPerson1 = (name) -> new Person(name);
        Function<String,Person> newPerson2 = Person::new; // 클래스::new

        System.out.println("newPerson1.get() = " + newPerson1.apply("kim"));
        System.out.println("newPerson2.get() = " + newPerson2.apply("kim"));





    }


}
