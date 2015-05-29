/**
 * Access Code 2.1
 * Ray Acevedo
 * MyObject.java
 */
public class MyObject {
    String name;
    int age;

    public MyObject (){}
    public MyObject (String name, int age){}
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public String getName()
    {
        return this.name;
    }

    public int getAge()
    {
        return this.age;
    }
}
