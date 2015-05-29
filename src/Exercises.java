public class Exercises {

    static class Parent {
        public String doStuff() { return "parent"; }
    }
    static class Child extends Parent {
        public String doStuff() { return "child"; }
        public String doStuff(String s) { return s; }
    }

    public static void main(String[] args)
    {
        Parent mom = new Parent();
        Child son = new Child();

        System.out.println(mom.doStuff());
        System.out.println(son.doStuff());
        System.out.println(son.doStuff("Hello!"));

    }


}
