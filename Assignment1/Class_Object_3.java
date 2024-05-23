public class Class_Object_3 {
    String name;
    int age;

    public Class_Object_3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating an object using the constructor
        Class_Object_3 person = new Class_Object_3("Alice", 30);
        person.display();
    }
}
