/**
 * Created by c4q-vanice on 5/28/15.
 */
public class MyObject {

    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public MyObject(String name, int age){
        this.name = name;
        this.age = age;
    }
}
