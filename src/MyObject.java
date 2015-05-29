/**
 * Created by c4q-madelyntavarez on 5/28/15.
 */
public class MyObject
{
    String name;
    int    age;

    public MyObject(String name, int age)
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
    public boolean equals(Object obj)
    {
        if(obj==null){return false;}

        if (obj instanceof MyObject) {
            MyObject object = (MyObject) obj;
            if (this.name.equalsIgnoreCase(object.name) && this.age == object.age)
            {
                return true;}
                  }
                return false;
          }


    public static void main(String[] args)
    {

        MyObject object3=new MyObject("Larry",20);
        object3.setName("LARRY");
        object3.setAge(20);
        MyObject object4=new MyObject("Larry",20);
        object4.setAge(20);
        object4.setName("LARRY");

        System.out.println((object3.equals(object4)));

    }
}