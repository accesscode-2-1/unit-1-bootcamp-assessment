/**
 * Created by c4q-sarahkim on 5/28/15.
 */
public class MyObject
{
    private String name;
    private int age;

    public MyObject() {

    }

    public MyObject (String name, int age) {
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

    public static boolean areEqual (MyObject one, MyObject two) {
        if (one.getName().equalsIgnoreCase(two.getName()) && one.getAge() == two.getAge()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args)
    {
        MyObject sarahObject = new MyObject("Sarah", 24);
        MyObject saraObject = new MyObject("Sara", 24);

        if (sarahObject.getName().equalsIgnoreCase(saraObject.getName())) {
            System.out.println("Same names!");
        } else {
            System.out.println("Different names!");
        }

        if (sarahObject.getAge() == saraObject.getAge()) {
            System.out.println("Same age!");
        } else {
            System.out.println("Different names!");
        }
    }
}
