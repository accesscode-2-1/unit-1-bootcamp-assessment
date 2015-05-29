import java.util.Objects;

public class Exercises {

    static class Parent {
        public String doStuff() { return "parent"; }
    }
    static class Child extends Parent {

        public String doStuff() { return "child"; }

        public String doStuff(String s) { return s; }
    }

//    public static void main(){
//
////        Parent p = new Parent();
////        p.doStuff();
//
//        Parent c =  new Child();
//        c.doStuff();
//
//
//        MyObject o1 = new MyObject("Java",3);
//        MyObject o2 = new MyObject("Java", 3);
//
//        System.out.println(o1.equals(o2));
//
//        Object node = new MyObject("hello",2);
//
//    }

}
