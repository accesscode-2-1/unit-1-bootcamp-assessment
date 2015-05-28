/**
 * Created by c4q-anthonyf on 5/28/15.
 */
public class MyObject
{
    String name;
    int age;

    public MyObject(){}

    public String getName(){
        return name;
    }

    public boolean equals(MyObject object){
        return name.equals(object.getName());
    }




}
