package methodref;

import java.util.function.Supplier;

public class MethodRefEx1 {
    public static void main(String[] args) {

        // 1.   정적 메서드 참조
        Supplier<String> staticMethod1 = () -> Person.greeting();
        Supplier<String> staticMethod2 = Person::greeting; // 클래스::정적메서드

        System.out.println("staticMethod1.get() = " + staticMethod1.get());
        System.out.println("staticMethod2.get() = " + staticMethod2.get());

        // 2. 특정 객체의 인스턴스 참조
        Person person = new Person("Kim");
        Supplier<String> instanceMethod1 = () -> person.introduce();
        Supplier<String> instanceMethod2 = person::introduce; // 객체::인스턴스메서드

        System.out.println("instanceMethod1.get() = " + instanceMethod1.get());
        System.out.println("instanceMethod2.get() = " + instanceMethod2.get());

        // 3. 생성자 참조
        Supplier<Person> newPerson1 = () -> new Person();
        Supplier<Person> newPerson2 = Person::new;

        System.out.println("newPerson1.get() = " + newPerson1.get());
        System.out.println("newPerson2.get() = " + newPerson2.get());





    }


}
