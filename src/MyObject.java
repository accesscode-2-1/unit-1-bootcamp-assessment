/**
 * Created by c4q-john on 5/28/15.
 */
public class MyObject
{


    public MyObject(int age)
    {
        this.age = age;
    }

    public MyObject(String name, int age)
    {
        this.name = name;
        this.age = age;

    }

    public String name;
    public int    age;

    public MyObject()
    {

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
        if(this == o)
        {
            return true;
        }
        if(! (o instanceof MyObject))
        {
            return false;
        }

        MyObject myObject = (MyObject) o;

        if(age != myObject.age)
        {
            return false;
        }
        if(name != null
                ? ! name.equals(myObject.name)
                : myObject.name != null)
        {
            return false;
        }

        return true;
    }

    public static void main(String[] args)
    {
        MyObject michael = new MyObject("Michael Jackson",50);
        System.out.println(michael.getName()+michael.getAge());
    }

}
