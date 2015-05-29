/**
 * Created by c4q-Abass on 5/28/15.
 */
public class MyObject {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int age;


    public MyObject(){
        this.name="";
        this.age=0;
    }

    public MyObject(String objName, int objAge){
        this.name = objName;
        this.age = objAge;
    }

    public boolean isEqual(MyObject s){
        return  ((this.name == s.getName())
                && (this.age == s.getAge())
        );
    }



}
