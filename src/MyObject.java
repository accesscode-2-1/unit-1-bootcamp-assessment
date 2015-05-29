/**
 * Created by c4q-anthony-mcbride on 5/28/15.
 */
public class MyObject
{
    private String name;
    private int    age;

    public MyObject()
    {
    }

    public MyObject(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
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

    public boolean isEqual(MyObject o)
    {
        return (this.name.equals(o.getName()) && this.age == o.getAge());
    }

}
