/**
 * Created by pooja on 5/29/15.
 */
public class MyObject {
    private String name;
    private int age;

    public MyObject(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean equals (MyObject one, MyObject two) {
        return one.name.equals(two.name) && one.age == two.age;
    }
}
