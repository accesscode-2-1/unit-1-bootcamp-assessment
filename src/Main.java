/**
 * Created by linusliang on 9/25/15.
 */
public class Main {
    public static void main(String[] args) {
        MyObject obj1 = new MyObject();
        MyObject obj2 = new MyObject();
        obj1.name = "hey";
        obj2.name = "hey";
        System.out.println("object1 equals object2? " + obj1.equals(obj2));
    }
}
