/**
 * Created by c4q-anthonyf on 5/28/15.
 */
public class MyObject
{
    String name;
    int age;

    public MyObject(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public boolean equals(MyObject object){
        return name.equals(object.getName());
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public static void main(String[] args)
    {
        MyObject person = new MyObject("Thomas Edison", 168);
        System.out.println(person.getName());
        System.out.println(person.getAge());

        person.setName("Anthony");
        person.setAge(26);
        System.out.println();
        System.out.println(person.getName());
        System.out.println(person.getAge());

    }


}
