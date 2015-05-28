/**
 * Created by alvin2 on 5/28/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public class MyObject
{
    protected String name;
    protected int age;

    public MyObject(String name, int age){
        this.name = name;
        this.age = age;
    }


    public boolean isEqual(MyObject obj1, MyObject obj2)
    {
        if(obj1.getName().equals(obj2.getName()) && obj1.getAge() == obj2.getAge())
        {
            return true;
        } else {
            return false;
        }
    }


    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
