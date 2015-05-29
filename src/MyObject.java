/**
 *
 * Create a new class, MyObject. A MyObject has a name (String) and an age (int).
 * Two MyObjects are equal when the names and the ages are equal.
 *
 * */
public class MyObject {
    String name = "";
    int age = 0;

    public MyObject (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public MyObject () {

    }

    public void setName (String name) {
        this.name = name;
    }

    public void setAge (int age) {
        this.age = age;
    }
    public String getName () {
        return this.name;
    }

    public int getAge () {
        return this.age;
    }


    public boolean equals (MyObject object) {
        return name.equalsIgnoreCase(object.getName()) && age == object.getAge();
    }


    public static void main(String[] args) {

        MyObject set1 = new MyObject();
        MyObject set2 = new MyObject();

        System.out.println(set1.equals(set2));

        set1.setName("John");

        System.out.println(set1.equals(set2));

        set2.setName("John");

        System.out.println(set1.equals(set2));

        set1.setAge(10);

        System.out.println(set1.equals(set2));

        set2.setAge(11);

        System.out.println(set1.equals(set2));

        set1.setAge(11);

        System.out.println(set1.equals(set2));


    }


}
