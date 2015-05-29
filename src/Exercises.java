public class Exercises {

    static class Parent {
        public String doStuff() { return "parent"; }
    }
    static class Child extends Parent {
        public String doStuff() { return "child"; }
        public String doStuff(String s) { return "Howdy"; }
    }

    public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println( p.doStuff());

        Child c = new Child();
        System.out.println(c.doStuff());
        System.out.println(c.doStuff("Test"));

    }


}
