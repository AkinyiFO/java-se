public class ConcatenationToString {
    public static void main(String[] args) {
        String str = "Hello";
        int age = 25;
        double salary = 98765.43;
        boolean active = true;

        // Custom object
        Person person = new Person("Alice", 30);

        // Concatenation with mixed types
        // Primitive types are automatically converted to their string representation
        String result = str + " World! Age: " + age
                + ", Salary: $" + salary
                + ", Active: " + active
                + ", Person: " + person;

        System.out.println(result);
    }
}

// Simple class to demonstrate toString() being called
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // This method is automatically called during concatenation
    // Overridden to offer a meaningful string
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
