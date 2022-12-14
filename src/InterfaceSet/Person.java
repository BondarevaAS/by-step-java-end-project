package InterfaceSet;

import java.util.HashSet;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}
class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> users = new HashSet<String>();


        users.add("Alex");
        users.add("Ivan");
        users.add("Elena");
        users.add("Mariya");

        System.out.printf("В коллекции %d Несортированных элемента: ", users.size());

        for (String name : users) {
            System.out.print(name + " ");
        }

        System.out.println();
        System.out.println("\nПробуем добавить существующий элемент Alex, результат: " + users.add("Alex"));
        System.out.println("\nПробуем удалить существующий элемент Alex, результат: " + users.remove("Alex"));

        System.out.println("\nХэш-таблица Несортированных объектов Person:");

        HashSet<Person> people = new HashSet<Person>();

        people.add(new Person("Anna"));
        people.add(new Person("Olga"));
        people.add(new Person("Petr"));
        people.add(new Person("Vladimir"));

        for (Person p : people) {
            System.out.println(p.hashCode() + "\t" + p.getName());
        }
    }





}
