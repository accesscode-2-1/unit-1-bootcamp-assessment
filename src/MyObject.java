/**
 * Created by c4q-madelyntavarez on 5/28/15.
 */
public class MyObject
{
    String name;
    int    age;


    public MyObject(String name, int age)
    {
        MyObject object1=new MyObject(name,age);

        MyObject object2=new MyObject(name,age);

        if(object1.getName()==object2.getName()&&object1.getAge()==object2.getAge()){

            object1=object2;
        }

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


    public static void main(String[] args)
    {

    }
}