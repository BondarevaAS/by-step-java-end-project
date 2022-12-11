package InterfaceMap;


import java.util.*;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> users = new HashMap<Integer, String>();
        users.put(1,"Alex");
        users.put(2,"Ivan");
        users.put(3,"Elena");
        users.put(4, "Mariya");


        System.out.println("Получим объект по ключу (2): " + users.get(2));


        Set<Integer> keys = users.keySet();
        System.out.println("Получим весь набор ключей: " + keys);


        Collection<String> values = users.values();
        System.out.println("Получим набор всех значений: " + values);


        System.out.println("Заменим элемент по ключу (2): " + users.replace(2,"Petr"));
        System.out.println("Получим набор всех значений: " + values);


        System.out.println("Удалим элемент по ключу(2): " + users.remove(2));
        System.out.println("Получим набор всех значений: " + values);


        System.out.println("\nПеребор элементов.");
        for (Map.Entry<Integer, String> item : users.entrySet()) {
            System.out.printf("Key: %d Value: %s \n", item.getKey(), item.getValue());
        }


        System.out.println("\nПеребор коллекции.");
        Map<String, Person> person = new HashMap<String, Person>();
        person.put("123i45",new Person("Alex"));
        person.put("456i78", new Person("Ivan"));
        person.put("789i01", new Person("Petr"));

        for (Map.Entry<String, Person> item : person.entrySet()) {
            System.out.printf("Key: %s Value: %s \n", item.getKey(), item.getValue().getName());
        }
    }
}
