import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //2 Дано множество сотрудников. Сотрудник содержит имя, фамилию, зарплату год трудоустройства. Определить всех сотрудников,
        //    фамилии которых начинающиеся на букву «J».
        //    имя которых длинее 7 символов
        //    3 самых новых сотрудника
        //    3 самых старых сотрудника, зп которых менее 100
        //    с почти самой большой зп
        Employee peter = new Employee("Jackson", "Peter", 130, 2000);
        Employee martin = new Employee("Freeman", "Martin", 50, 2001);
        Employee ian = new Employee("McKellen", "Ian", 140, 1988);
        Employee cate = new Employee("Blanchette", "Cate", 80, 1999);
        Employee evangeline = new Employee("Lilly", "Evangeline", 90, 2005);
        Employee gemma = new Employee("Jones", "Gemma", 68, 2006);

        System.out.println("Определить всех сотрудников фамилии которых начинающиеся на букву «J»:");
        Arrays.asList(peter, martin, ian, cate, evangeline, gemma).stream()
                .filter(n -> n.surname.charAt(0) == 'J').forEach(System.out::println);

        System.out.println("\nОпределить всех сотрудников имя которых длинее 7 символов:");
        Arrays.asList(peter, martin, ian, cate, evangeline, gemma).stream().
                filter(n -> n.name.length() > 7).forEach(System.out::println);

        System.out.println("\nОпределить всех сотрудников 3 самых новых сотрудника:");
        Arrays.asList(peter, martin, ian, cate, evangeline, gemma).stream()
                .sorted((n1, n2) -> n2.yearOfEmployment - n1.yearOfEmployment)
                .limit(3).forEach(System.out::println);

        System.out.println("\nОпределить всех сотрудников  3 самых старых сотрудника, зп которых менее 100:");
        Arrays.asList(peter, martin, ian, cate, evangeline, gemma).stream()
                .sorted((n1, n2) -> n1.yearOfEmployment - n2.yearOfEmployment)
                .filter(x -> x.salary < 100).limit(3).forEach(System.out::println);

        System.out.println("\n Определить всех сотрудников с почти самой большой зп:");
        Arrays.asList(peter, martin, ian, cate, evangeline, gemma).stream()
                .sorted((n1, n2) -> n2.salary - n1.salary).skip(1).limit(1).forEach(System.out::println);
    }
}