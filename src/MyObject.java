/**
 * Created by c4q-joshelynvivas on 5/28/15.
 */
public class MyObject
{
    String name;
    int    age;

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

    public MyObject(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public static void main(String args[])
    {

        System.out.println("Abstract Class main method : ");

    }

}

