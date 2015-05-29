/**
 * Created by Luke Lee on 5/28/15.
 */
public class MyObject {

    String name;
    int age;

    public MyObject(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MyObject) {
            MyObject object = (MyObject) obj;
            if (this.name.equalsIgnoreCase(object.name) && this.age == object.age) {
                return true;
            }
        }
        return false;
    }
}
