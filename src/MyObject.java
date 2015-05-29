/**
 * Created by s3a on 5/28/15.
 *
 * Janneisy Vidals
 *
 * Due:
 * Task:
 */
public class MyObject
{
    int    age;
    String name;

    public MyObject (int age, String name)
    {
        this.age = age;
        this.name = name;

    }



    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public boolean equals(Object obj)
    {
        return super.equals(obj);
    }


    public boolean equals(String name, String name2){

        name= "Jan";
        name2= "Jan";

        if(name.equalsIgnoreCase(name2));
        return true;

    }
}
