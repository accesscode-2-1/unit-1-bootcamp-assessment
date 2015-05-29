/**
 * Created by c4q-marbella on 5/28/15.
 * Access Code 2-1
 * Marbella Vidals
 */
public class MyObject
{
    private String name;
    private int    age;

    public MyObject(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public boolean equals(Object o)
    {
        if(o instanceof MyObject)
        {
            MyObject myO = (MyObject) o;
            if(getName() == getName() & getAge() == getAge())
            {
                return true;
            }
        }
        return false;
    }

}