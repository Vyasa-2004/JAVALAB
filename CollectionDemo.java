import java.util.*;

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

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class CollectionDemo {
    public static void main(String[] args) {
        // Creating a list of Person objects
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));
        people.add(new Person("Diana", 28));

        // Sorting the list by age using a custom comparator
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.getAge(), p2.getAge());
            }
        });

        // Printing the sorted list
        System.out.println("Sorted by age:");
        for (Person person : people) {
            System.out.println(person);
        }

        // Searching for a specific person in the sorted list using binary search
        Person target = new Person("Bob", 25);
        int index = Collections.binarySearch(people, target, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.getAge(), p2.getAge());
            }
        });

        if (index >= 0) {
            System.out.println("\nFound " + target + " at index " + index);
        } else {
            System.out.println("\n" + target + " not found in the list.");
        }
    }
    }
