package methodref;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MethodRefEx4 {

    public static void main(String[] args) {
        List<Person> personList = List.of(
                new Person("Kim"),
                new Person("Park"),
                new Person("Lee")
        );


        List<String> result1 = mapPersonToString(personList, person -> person.introduce());
        System.out.println("result1 = " + result1);
        List<String> result2 = mapPersonToString(personList, Person::introduce);
        System.out.println("result2 = " + result2);

        List<String> upperResult1 = mapStringToString(result1, (String s) -> s.toUpperCase());
        System.out.println("result3 = " + upperResult1);
        List<String> upperResult2 = mapStringToString(result2, String::toUpperCase);
        System.out.println("result4 = " + upperResult2);


    }

    static List<String> mapPersonToString(List<Person> personList, Function<Person,String> func){
        List<String> result = new ArrayList<>();
        for (Person person : personList) {
            result.add(func.apply(person));
        }
        return result;
    }

    static List<String> mapStringToString(List<String> strings, Function<String,String> func){
        List<String> result = new ArrayList<>();
        for (String string : strings) {
            result.add(func.apply(string));
        }
        return result;
    }


}
