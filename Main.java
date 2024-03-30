package cr;


public class Main {
    public static void main(String[] args) {
        // Создание экземпляра вашей очереди
        queue<Person> personQueue = new queue<>();

        // Добавление нескольких объектов Person в очередь
        personQueue.add(new Person("Alice", 25));
        personQueue.add(new Person("Bob", 30));
        personQueue.add(new Person("Charlie", 35));

        // Извлечение и вывод данных объектов из очереди
        while (personQueue.size() > 0) {
            Person person = personQueue.remove();
            System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
        }
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
