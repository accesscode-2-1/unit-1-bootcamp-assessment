import java.util.Objects;

/**
 * Created by c4q-nali on 5/28/15.
 */
public class MyObject {

    String name;
    int age;

    public MyObject(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj instanceof MyObject) {
            if (((MyObject) obj).age == age) {
                return Objects.equals(name, ((MyObject) obj).name);
//                if (name!=null){
//                    return name.equals(((MyObject) obj).name);
//                }else if (((MyObject) obj).name!=null){
//                    return ((MyObject) obj).name.equals(name);
//                }else {
//                    return true;
//                }
//
            }
        }

        return false;
    }
}
// press command and click mouse to see the info of that method.